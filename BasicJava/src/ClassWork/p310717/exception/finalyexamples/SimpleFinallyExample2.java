package ClassWork.p310717.exception.finalyexamples;

class SimpleFinallyExample2 {

    public static void main(String[] args) {

        int r = get();

        System.out.println(r);
    }

    private static int get() {
        try {
            int x = 10 / 0;
            return 0;
        } catch (Exception e) {
            int x = 10 / 0;
            return 10;
        } finally {
            return 20;
        }
    }

}
