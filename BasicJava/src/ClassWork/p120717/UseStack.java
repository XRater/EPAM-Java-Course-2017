package ClassWork.p120717;

import TestFramework.Asserts;

public class UseStack {

    public static void main(String[] args) {
        testStringStack();
    }

    public static void testStringStack() {

        StringStack stack = new StringStack();

        Asserts.assertEquals(stack.getSize(), 0);
        Asserts.assertEquals(stack.toString(), "[]");
        Asserts.assertEquals(stack.isEmpty(), true);

        stack.push("one");
        stack.push("two");
        stack.push("three");

        Asserts.assertEquals(stack.getSize(), 3);
        Asserts.assertEquals(stack.toString(), "[one, two, three]");
        Asserts.assertEquals(stack.isEmpty(), false);

        Asserts.assertEquals(stack.top(), "three");

        stack.pop();
        Asserts.assertEquals(stack.top(), "two");
        Asserts.assertEquals(stack.toString(), "[one, two]");

        Asserts.assertEquals(stack.pop(), "two");
        Asserts.assertEquals(stack.toString(), "[one]");
        Asserts.assertEquals(stack.getSize(), 1);
        stack.pop();

        stack.top();
        Asserts.assertEquals(stack.toString(), "[]");
        Asserts.assertEquals(stack.getSize(), 0);
        stack.pop();

    }

}
