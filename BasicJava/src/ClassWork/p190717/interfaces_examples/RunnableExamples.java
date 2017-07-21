package ClassWork.p190717.interfaces_examples;

class RunnableExamples {

    public static void main(String[] args) {

        Thread thread = new Thread(new Task());
        thread.start();

        new Task().run();
    }

}

class Task implements Runnable {

    @Override
    public void run() {
        int count = 0;
        while (true) {
            System.out.println(count++);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
