package Homework.p110717.philosophers;

public class Fork {

    private Philosopher owner = null;
    private final int number;

    public Fork(int number) {
        this.number = number;
    }

    public Philosopher getOwner() {
        return owner;
    }

    public void takeFork(Philosopher owner) {
        System.out.println("Fork " + number + " is taken by philosopher " + owner.getNumber());
        this.owner = owner;
    }

    public void drop() {
        System.out.println("Fork " + number + " is now released");
    }

}
