package HomeWork.p070717;

import TestFramework.Asserts;

public class UseStringArrayList {

    public static void main(String[] args) {

        StringArrayList list = new StringArrayList();

        Asserts.assertEquals(list.getSize(), 0);
        Asserts.assertEquals(list.toString(), "[]");

        list.add("one");

        Asserts.assertEquals(list.getSize(), 1);
        Asserts.assertEquals(list.toString(), "[one]");

        list.add("two");
        list.add("three");

        Asserts.assertEquals(list.getSize(), 3);
        Asserts.assertEquals(list.toString(), "[one, two, three]");

        list.remove(0);
        list.remove(5);

        Asserts.assertEquals(list.toString(), "[two, three]");

        list.add("two");
        list.add("three");

        Asserts.assertEquals(list.toString(), "[two, three, two, three]");

        list.remove("two");
        list.remove("two");
        list.remove("two");

        Asserts.assertEquals(list.toString(), "[three, three]");
    }

}
