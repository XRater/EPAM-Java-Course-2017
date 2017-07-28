package ClassWork.p280717.exception;

class ExceptionsExamples {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("start");

        Thread thread = new Thread(() -> {
//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            Thread.sleep(5000);
        });

        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread.interrupt();

        System.out.println("stop");
    }

}
