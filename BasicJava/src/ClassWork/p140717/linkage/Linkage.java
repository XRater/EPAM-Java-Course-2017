package ClassWork.p140717.linkage;

import java.util.Random;

public class Linkage {

    static class Processor {

        int process(int[] a) {
            int s = 0;
            for (int value : a)
                s += value;
            return s;
        }

    }

    static class AnotherProcessor extends Processor {
        @Override
        int process(int[] a) {
            return -super.process(a);
        }
    }


    static Processor proc;

    static {
        Random r = new Random();
        proc = r.nextBoolean() ? new Processor() : new AnotherProcessor();
    }

    public static void main(String[] args) {

        int[] a = {0, 1, 2, 3};

        int result = process(a);

        int alternateResult = proc.process(a);
    }

    private static int process(int[] a) {
        int s = 0;
        for (int value : a)
            s += value;
        return s;
    }

}
