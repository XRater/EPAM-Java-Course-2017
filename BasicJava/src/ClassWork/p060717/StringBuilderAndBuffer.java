package ClassWork.p060717;

public class StringBuilderAndBuffer {

    public static void main(String[] args) {
        int[] a = new int[10000];


//        String s =
//        long start = System.currentTimeMillis();
//        String s = toString(a);
//        long stop = System.currentTimeMillis();
//        System.out.println(stop - start);

        long start = System.currentTimeMillis();
        String s = toString2(a);
        long stop = System.currentTimeMillis();
        System.out.println(stop - start);
    }

    private static String toString2(int[] a) {
        StringBuilder sb = new StringBuilder('[');

        if (a.length > 0) {
            sb.append(a[0]);
            for (int i = 1; i < a.length; i++)
                sb.append(",").append(a[i]);
        }

        sb.append(']');

        return sb.toString();
    }

    private static String toString(int[] a) {

        String r = "[";

        if (a.length > 0) {
            r += a[0];
            for (int i = 1; i < a.length; i++)
                r += "," + a[i];
        }

        r = "]";

        return r;
    }

}
