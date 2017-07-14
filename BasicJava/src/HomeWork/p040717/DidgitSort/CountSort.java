package HomeWork.p040717.DidgitSort;

import HomeWork.p040717.DidgitSort.DigitHolder;

import java.util.Arrays;

import static HomeWork.p040717.DidgitSort.SortsTest.testRadixSort;

public class CountSort {

    private static final int DIGIT_NUMBER = 10;

    /*
        //Base count sort method. Evaluates maximal and minimal values and
        // calls sort(array, min, max) method
    */
    public static void sort(int[] array) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int value : array) {
            if (max < value)
                max = value;
            if (min > value)
                min = value;
        }
        sort(array, min, max + 1);
    }

    //Method for sort digits [0,9). Used for Radix Sort.
    public static void sortDigits(int[] a) {
        sort(a, 0, 10);
    }

    //All numbers are greater or equal then mn and less then mx (every vlue \in [,mn mx))
    private static void sort(int[] array, int mn, int mx) {

        //count frequencies
        int m = mx - mn;
        int[] count = new int[m];
        for (int value : array)
            count[value - mn]++;

        //evaluate start of every block
        int[] pos = new int[m];
        for (int i = 0; i + 1 < m; i++)
            pos[i + 1] = pos[i] + count[i];

        //fill result array
        int[] copyOfa = Arrays.copyOf(array, array.length);
        for (int value : copyOfa)
            array[pos[value - mn]++] = value;
    }

    public static void sortByDigit(DigitHolder[] array, int index) {

        //count frequencies
        int[] count = new int[DIGIT_NUMBER];
        for (DigitHolder value : array)
            count[value.get(index)]++;

        //evaluate start of every block
        int[] pos = new int[DIGIT_NUMBER];
        for (int i = 0; i + 1 < DIGIT_NUMBER; i++)
            pos[i + 1] = pos[i] + count[i];

        //fill result array
        DigitHolder[] copyOfa = Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length; i++) {
            array[pos[copyOfa[i].get(index)]++] = copyOfa[i];
        }
    }

    //main for easier testing
    public static void main(String[] args) {
        testRadixSort();
    }
}
