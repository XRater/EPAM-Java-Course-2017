package Homework.p110717.philosophers;

import utlis.Utils;

public class Philosopher {

    final Fork left, right;
    final int number;

    public Philosopher(Fork left, Fork right, int number) {
        this.left = left;
        this.right = right;
        this.number = number;
    }

    public void processSimple() {
        while (true) {

            this.message("Getting left fork");
            synchronized (left) {
                left.takeFork(this);
                this.message("Got left fork");

                this.message("Getting right fork");
                synchronized (right) {
                    right.takeFork(this);
                    this.message("Got right fork");

                    eat();

                    this.message("Putting down right fork");
                    right.drop();
                }

                left.drop();
                this.message("Putting down left fork");
            }

        }
    }

    public void processSmart() {

    }

    private void eat() {
        if (left.getOwner() != this || right.getOwner() != this) {
            this.message("Error! I can't eat!");
            return;
        }

        this.message("Eating...");
        Utils.pause(1000);
    }

    public int getNumber() {
        return number;
    }

    private void message(String string) {
        System.out.println(string + " Says " + this.number + " philosopher");
    }
}
