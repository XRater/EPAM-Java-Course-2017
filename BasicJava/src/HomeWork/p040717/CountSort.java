package HomeWork.p040717;

import java.util.Arrays;

import static HomeWork.p040717.SortsTest.testCount;

public class CountSort {

    static final int MINF = Integer.MIN_VALUE;
    static final int INF = Integer.MAX_VALUE;


    public static void sort(int[] a) {
        int max = MINF;
        int min = INF;
        for (int value : a) {
            if (max < value)
                max = value;
            if (min > value)
                min = value;
        }
        sort(a, min, max + 1);
    }

    public static void sortDigits(int[] a) {
        sort(a, 0, 10);
    }

    private static void sort(int[] a, int mn, int mx) {
        int[] count = new int[mx - mn];
        for (int value: a)
            count[value - mn]++;

        int index = 0;
        for (int i = 0; i < count.length; i++)
            for (int j = 0; j < count[i]; j++)
                a[index++] = i + mn;
    }


    public static void main(String[] args) {
        testCount();
    }
}
