package ClassWork.p310717.exception;

import java.util.Random;

class MultiCatchExample {

    public static void main(String[] args) {

        System.out.println("start");

        try {
            process();
        } catch (IllegalArgumentException | NullPointerException | ArithmeticException e) {
            System.err.println(e.getClass().getName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("finish");
    }

    private static void process() {

        Random r = new Random();

        int state = r.nextInt(4);

        switch (state) {
            case 0:
                throw new IllegalArgumentException();
            case 1:
                throw new NullPointerException();
            case 2:
                throw new ArithmeticException();
            case 3:
                throw new RuntimeException();
        }
    }

}
