package HomeWork.p040717;

import TestFramework.Asserts;

import java.util.Arrays;

public class ArrayToString {

    static public String toString(int[] data) {
        if (data.length == 0)
            return "[]";

        String ans = "[";
        ans += data[0];

        for (int i = 1; i < data.length; i++)
            ans += ", " + data[i];

        ans += "]";

        return ans;
    }

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {};
        int[] c = {-1, 1, 0};

        Asserts.assertEquals(toString(a), Arrays.toString(a));
        Asserts.assertEquals(toString(b), Arrays.toString(b));
        Asserts.assertEquals(toString(c), Arrays.toString(c));
    }

}
