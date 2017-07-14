package HomeWork.p070717;

import TestFramework.Asserts;

public class UseStringArrayList {

    public static void main(String[] args) {

        testAdd();
        testGetSet();
//        testRemoveIndex();
//        testRemoveValue();
//        testGeneral();
    }

    private static void testAdd() {
        StringArrayList list = new StringArrayList();

        //simple adds
        Asserts.assertEquals(list.toString(), "[]");
        list.add("one");
        Asserts.assertEquals(list.toString(), "[one]");
        list.add("two");
        Asserts.assertEquals(list.toString(), "[one, two]");
        list.add("three");
        Asserts.assertEquals(list.toString(), "[one, two, three]");

        //add equals
        list.clear();
        Asserts.assertEquals(list.toString(), "[]");
        list.add("one");
        Asserts.assertEquals(list.toString(), "[one]");
        list.add("one");
        Asserts.assertEquals(list.toString(), "[one, one]");
        list.add("two");
        Asserts.assertEquals(list.toString(), "[one, one, two]");
        list.add("one");
        Asserts.assertEquals(list.toString(), "[one, one, two, one]");

        //add nulls
        list.clear();
        Asserts.assertEquals(list.toString(), "[]");
        list.add(null);
        Asserts.assertEquals(list.toString(), "[null]");
        list.add(null);
        Asserts.assertEquals(list.toString(), "[null, null]");
        list.add("one");
        Asserts.assertEquals(list.toString(), "[null, null, one]");
    }

    private static void testGetSet() {
        StringArrayList list = new StringArrayList();

        //simple gets and sets
        list.add("one");
        list.add("two");
        list.add("three");
        Asserts.assertEquals(list.get(0), "one");
        Asserts.assertEquals(list.get(1), "two");
        Asserts.assertEquals(list.get(2), "three");
        list.set(0, "one");
        list.set(1, "two_");
        Asserts.assertEquals(list.get(0), "one");
        Asserts.assertEquals(list.get(1), "two_");
        Asserts.assertEquals(list.get(2), "three");
        Asserts.assertEquals(list.toString(), "[one, two_, three]");

        //null gets and sets
        list.clear();
        list.add("one");
        list.add("two");
        list.add("three");
        list.set(1, null);
        Asserts.assertEquals(list.get(0), "one");
        Asserts.assertEquals(list.get(1), "null");
        Asserts.assertEquals(list.get(2), "three");
        Asserts.assertEquals(list.toString(), "[one, null, three]");
        list.set(2, null);
        Asserts.assertEquals(list.get(0), "one");
        Asserts.assertEquals(list.get(1), "null");
        Asserts.assertEquals(list.get(2), "null");
        Asserts.assertEquals(list.toString(), "[one, null, null]");

    }

}
