package TestFramework;

import java.util.Arrays;
import java.util.Objects;

public class Asserts {

    public static boolean assertEquals(String actual, String expected) {
        if (actual == null)
            return expected.equals("null");
        boolean equals = actual.equals(expected);
        if (!equals) {
            System.err.println("Test failed: expected '" + expected
                    + "', but actual '" + actual + "'");
        }
        return equals;
    }

    public static boolean assertNotEquals(String actual, String expected) {
        if (actual == null)
            return !expected.equals("null");
        boolean notEquals = !actual.equals(expected);
        if (!notEquals) {
            System.err.println("Test failed: expected NOT " + expected
                    + ", but actual " + actual);
        }
        return notEquals;
    }

    public static boolean assertEquals(int actual, int expected) {
        boolean equals = actual == expected;
        if (!equals) {
            System.err.println("Test failed: expected " + expected
                    + ", but actual " + actual);
        }
        return equals;
    }

    public static boolean assertNotEquals(int actual, int expected) {
        boolean notEquals = actual != expected;
        if (!notEquals) {
            System.err.println("Test failed: expected NOT " + expected
                    + ", but actual " + actual);
        }
        return notEquals;
    }

    public static boolean assertEquals(boolean actual, boolean expected) {
        boolean equals = actual == expected;
        if (!equals) {
            System.err.println("Test failed: expected " + expected
                    + ", but actual " + actual);
        }
        return equals;
    }

    public static boolean assertNotEquals(boolean actual, boolean expected) {
        boolean notEquals = !(actual == expected);
        if (!notEquals) {
            System.err.println("Test failed: expected " + expected
                    + ", but actual " + actual);
        }
        return notEquals;
    }

    public static boolean assertEquals(int[] actual, int[] expected) {
        if (actual == null)
            return expected == null;
        boolean equals = Arrays.equals(actual, expected);
        if (!equals) {
            System.err.println("Test failed: expected '" + Arrays.toString(expected)
                    + "', but actual '" + Arrays.toString(actual) + "'");
        }
        return equals;
    }

    public static boolean assertNotEquals(int[] actual, int[] expected) {
        if (actual == null)
            return expected != null;
        boolean notEquals = !Arrays.equals(actual, expected);
        if (!notEquals) {
            System.err.println("Test failed: expected NOT " + Arrays.toString(expected)
                    + ", but actual " + Arrays.toString(actual));
        }
        return notEquals;
    }
}