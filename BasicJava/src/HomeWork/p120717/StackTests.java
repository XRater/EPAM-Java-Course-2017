package HomeWork.p120717;

import TestFramework.Asserts;

public class StackTests {

    public static void main(String[] args) {

        test_basic();
        test_push();
        test_pop();
        test_sizes();

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
    }

    private static void test_pop() {
    }

    private static void test_sizes() {
    }

}
