package HomeWork.p040717;

import java.util.Arrays;

import static HomeWork.p040717.SortsTest.testCount;

public class CountSort {

/*
    //Base count sort method. Evaluates maximal and minimal values and
    // calls sort(array, min, max) method
*/
    public static void sort(int[] a) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int value : a) {
            if (max < value)
                max = value;
            if (min > value)
                min = value;
        }
        sort(a, min, max + 1);
    }

    //Method for sort digits [0,9). Used for Radix Sort.
    public static void sortDigits(int[] a) {
        sort(a, 0, 10);
    }

    //All numbers are greater or equal then mn and less then mx (every vlue \in [,mn mx))
    private static void sort(int[] a, int mn, int mx) {
        int[] count = new int[mx - mn];
        for (int value: a)
            count[value - mn]++;

        int index = 0;
        for (int i = 0; i < count.length; i++)
            for (int j = 0; j < count[i]; j++)
                a[index++] = i + mn;
    }

    //main for easier testing
    public static void main(String[] args) {
        testCount();
    }
}
