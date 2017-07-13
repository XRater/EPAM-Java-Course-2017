package Homework.p110717.philosophers;

public class PhilosophersProblem {

    private static final int QUANTITY = 5;

    public static void main(String[] args) {

        Fork[] forks = new Fork[QUANTITY];
        Philosopher[] philosophers = new Philosopher[QUANTITY];

        setUp(forks, philosophers);
    }


    static void setUp(Fork[] forks, Philosopher[] philosophers) {
        for (int i = 0; i < QUANTITY; i++)
            forks[i] = new Fork(i);

        for (int i = 0; i < QUANTITY - 1; i++)
            philosophers[i] = new Philosopher(forks[i], forks[i + 1], i);
        philosophers[QUANTITY - 1] =
                new Philosopher(forks[QUANTITY - 1], forks[0], QUANTITY - 1);

        for (int i = 0; i < QUANTITY; i++) {
            int finalI = i;
            new Thread(()->{
                philosophers[finalI].processSimple();
            }).start();
        }
    }
}
