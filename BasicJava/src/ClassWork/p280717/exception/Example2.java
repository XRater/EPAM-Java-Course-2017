package ClassWork.p280717.exception;

class Example2 {

    public static void main(String[] args) {

        try {
            pause(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private static void pause(int seconds) throws InterruptedException {

        Thread.sleep(seconds * 1000);

    }

}
