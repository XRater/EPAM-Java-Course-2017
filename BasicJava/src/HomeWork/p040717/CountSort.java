package HomeWork.p040717;

public class CountSort {

    static final int MINF = Integer.MIN_VALUE;
    static final int INF = Integer.MAX_VALUE;


    public static void sort(int[] a) {
        int max = MINF;
        int min = INF;
        for (int i = 0; i < a.length; i++) {
            if (max < a[i])
                max = a[i];
            if (min > a[i])
                min = a[i];
        }
        sort(a, min, max);
    }

    public static void sortDigits(int[] a) {
        sort(a, 0, 10);
    }

    private static void sort(int[] a, int mn, int mx) {
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a.length; j++)
                if (a[i] < a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
    }

}
