package HomeWork.p120717;

import TestFramework.Asserts;

public class StackTests {

    public static void main(String[] args) {

        test_basic();
        test_push();
        test_pop();

    }

    private static void test_basic() {
        StringStack stack = new StringStack();

        Asserts.assertEquals(stack.toString(), "[]");
        Asserts.assertEquals(stack.isEmpty(), true);
        Asserts.assertEquals(stack.getSize(), 0);

        stack.push("one");
        stack.push("two");
        stack.push("three");

        Asserts.assertEquals(stack.toString(), "[one, two, three]");
        Asserts.assertEquals(stack.isEmpty(), false);
        Asserts.assertEquals(stack.getSize(), 3);
    }

    private static void test_push() {
        StringStack stack = new StringStack(3);

        Asserts.assertEquals(stack.toString(), "[]");
        Asserts.assertEquals(stack.isEmpty(), true);
        Asserts.assertEquals(stack.getSize(), 0);

        Asserts.assertEquals(stack.push("one"), true);
        Asserts.assertEquals(stack.push("two"), true);
        Asserts.assertEquals(stack.push("three"), true);

        Asserts.assertEquals(stack.toString(), "[one, two, three]");
        Asserts.assertEquals(stack.isEmpty(), false);
        Asserts.assertEquals(stack.getSize(), 3);

        Asserts.assertEquals(stack.push("four"), false);

        Asserts.assertEquals(stack.toString(), "[one, two, three]");
        Asserts.assertEquals(stack.isEmpty(), false);
        Asserts.assertEquals(stack.getSize(), 3);

        //empty test
        stack = new StringStack(0);

        Asserts.assertEquals(stack.toString(), "[]");
        Asserts.assertEquals(stack.isEmpty(), true);
        Asserts.assertEquals(stack.getSize(), 0);

        Asserts.assertEquals(stack.push("one"), false);
        Asserts.assertEquals(stack.push("two"), false);
        Asserts.assertEquals(stack.push("three"), false);

        Asserts.assertEquals(stack.toString(), "[]");
        Asserts.assertEquals(stack.isEmpty(), true);
        Asserts.assertEquals(stack.getSize(), 0);
    }

    private static void test_pop() {
        StringStack stack = new StringStack();

        stack.push("one");
        stack.push("two");
        stack.push("three");

        Asserts.assertEquals(stack.pop(), "three");
        Asserts.assertEquals(stack.pop(), "two");
        Asserts.assertEquals(stack.pop(), "one");
        Asserts.assertEquals(stack.pop(), "null");
    }

}
