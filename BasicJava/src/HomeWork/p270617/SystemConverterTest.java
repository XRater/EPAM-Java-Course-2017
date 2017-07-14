package HomeWork.p270617;

import TestFramework.Asserts;

public class SystemConverterTest {

    public static void main(String[] args) {

        Asserts.assertEquals(SystemConverter.toString(0, 3), "0");
        Asserts.assertEquals(SystemConverter.toString(1, 3), "1");
        Asserts.assertEquals(SystemConverter.toString(2, 3), "2");
        Asserts.assertEquals(SystemConverter.toString(3, 3), "10");
        Asserts.assertEquals(SystemConverter.toString(14, 3), "112");

        Asserts.assertEquals(SystemConverter.toString(0, 5), "0");
        Asserts.assertEquals(SystemConverter.toString(8, 7), "11");
        Asserts.assertEquals(SystemConverter.toString(5, 5), "10");
        Asserts.assertEquals(SystemConverter.toString(10, 5), "20");
        Asserts.assertEquals(SystemConverter.toString(190, 9), "231");

        Asserts.assertEquals(SystemConverter.toString(0, 36), "0");
        Asserts.assertEquals(SystemConverter.toString(35, 36), "Z");
        Asserts.assertEquals(SystemConverter.toString(12, 25), "C");
        Asserts.assertEquals(SystemConverter.toString(922, 30), "10M");
        Asserts.assertEquals(SystemConverter.toString(127, 2), "1111111");

        Asserts.assertEquals(SystemConverter.toBinaryString(0), "0");
        Asserts.assertEquals(SystemConverter.toBinaryString(1), "1");
        Asserts.assertEquals(SystemConverter.toBinaryString(2), "10");
        Asserts.assertEquals(SystemConverter.toBinaryString(7), "111");
        Asserts.assertEquals(SystemConverter.toBinaryString(14), "1110");

        Asserts.assertEquals(SystemConverter.toHexString(0), "0");
        Asserts.assertEquals(SystemConverter.toHexString(1), "1");
        Asserts.assertEquals(SystemConverter.toHexString(10), "Sample");
        Asserts.assertEquals(SystemConverter.toHexString(16), "10");
        Asserts.assertEquals(SystemConverter.toHexString(171), "AB");

        Asserts.assertEquals(SystemConverter.toOctalString(0), "0");
        Asserts.assertEquals(SystemConverter.toOctalString(1), "1");
        Asserts.assertEquals(SystemConverter.toOctalString(8), "10");
        Asserts.assertEquals(SystemConverter.toOctalString(17), "21");
        Asserts.assertEquals(SystemConverter.toOctalString(125), "175");
    }

}
