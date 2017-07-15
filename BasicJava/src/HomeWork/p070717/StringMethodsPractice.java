package ClassWork.p070717;

import TestFramework.Asserts;

public class StringMethodsPractice {

    public static void main(String[] args) {

        String s = "   Hello ";
        String s2 = "Hello";
        String s3 = "   Hello";
        String s4 = "Hello  ";
        String s5 = " He  l lo ";
        String s6 = "";

        Asserts.assertEquals(trim(s), "Hello");
        Asserts.assertEquals(trim(s2), "Hello");
        Asserts.assertEquals(trim(s3), "Hello");
        Asserts.assertEquals(trim(s4), "Hello");
        Asserts.assertEquals(trim(s5), "He  l lo");
        Asserts.assertEquals(trim(s6), "");
        trim(s4);
    }

    private static String trim(String s) {
        if (s == null || s.length() == 0)
            return s;
        if (s.indexOf(' ') == -1)
            return s;

        int begin = 0;
        int end = s.length() - 1;

        while (s.charAt(begin++) <= ' ') {}
        while (s.charAt(end--) <= ' ') {}

        return s.substring(begin - 1, end + 2);
    }

}
