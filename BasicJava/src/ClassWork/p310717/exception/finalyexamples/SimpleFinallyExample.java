package ClassWork.p310717.exception.finalyexamples;

class SimpleFinallyExample {

    public static void main(String[] args) {

        try {
            process();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void process() {
        try {
            System.out.println("befor");
            internal();
            System.out.println("after");
        } finally {
            System.out.println("finally");
        }
        System.out.println("finish");
    }

    private static void internal() {
        throw new RuntimeException();
    }

}
