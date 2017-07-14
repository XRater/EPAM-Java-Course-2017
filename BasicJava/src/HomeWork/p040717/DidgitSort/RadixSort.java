package HomeWork.p040717.DidgitSort;

import static HomeWork.p040717.DidgitSort.SortsTest.testRadixSort;

public class RadixSort {

//    Simple Radix Sort. DigitHolder class is used for implementation. Details in DigitHolder.java file.
    public static void sort(int[] array) {
        DigitHolder[] digits = new DigitHolder[array.length];

//        Construct DigitHolder class from integers
        for (int i = 0; i < array.length; i++)
            digits[i] = new DigitHolder(array[i]);

//       Consequently sorting our numbers by every digit. Starting with the least significant one
        for (int i = 0; i < DigitHolder.SIZE; i++)
            CountSort.sortByDigit(digits, i);

//        Convert DigitHolders back to integer numbers
        for (int i = 0; i < array.length; i++)
            array[i] = Integer.parseInt(digits[i].toString());
    }

    public static void main(String[] args) {
        testRadixSort();
    }

}
