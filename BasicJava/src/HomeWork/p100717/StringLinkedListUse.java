package ClassWork.p100717;

import TestFramework.Asserts;

public class StringLinkedListUse {

    public static void main(String[] args) {
        test();
    }

    public static void test() {
        StringLinkedList list = new StringLinkedList();

        Asserts.assertEquals(list.toString(), "[]");
        Asserts.assertEquals(list.isEmpty(), true);
        Asserts.assertEquals(list.getSize(), 0);

        list.add("one");
        list.add("two");
        Asserts.assertEquals(list.toString(), "[one, two]");

        list.add("one");
        Asserts.assertEquals(list.toString(), "[one, two, one]");
        Asserts.assertEquals(list.isEmpty(), false);
        Asserts.assertEquals(list.getSize(), 3);

        list.remove("three");
        list.remove("one");
        list.remove("one");
        Asserts.assertEquals(list.remove("two"), true);
        Asserts.assertEquals(list.remove("one"), false);
        Asserts.assertEquals(list.toString(), "[]");
    }

}
