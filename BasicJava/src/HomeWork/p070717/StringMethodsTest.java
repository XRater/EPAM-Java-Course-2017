package HomeWork.p070717;

import TestFramework.Asserts;

import java.util.ArrayList;

public class StringMethodsTest {

    public static void main(String[] args) {
        testTrim();
        testReplace();
    }

    private static void testReplace() {
        Asserts.assertEquals(StringMethods.replace("Hello", 'l', ' '), "He  o");
        Asserts.assertEquals(StringMethods.replace("", 'a', 'b'), "");
        Asserts.assertEquals(StringMethods.replace("aaa", 'a', 'b'), "bbb");
        Asserts.assertEquals(StringMethods.replace("abacaba", 'a', 'a'), "abacaba");
        Asserts.assertEquals(StringMethods.replace("abacaba", 'a', 'b'), "bbbcbbb");
        Asserts.assertEquals(StringMethods.replace("Hi there!", 'l', 'i'), "Hi there!");
    }

    private static void testTrim() {
        ArrayList<String> list = new ArrayList<>();
        list.add("  Hello ");
        list.add("Hello");
        list.add("   Hello");
        list.add("Hello ");
        list.add("  H el lo ");
        list.add("");

        for (String string : list)
            Asserts.assertEquals(StringMethods.trim(string), string.trim());
    }

}
