package ClassWork.p120717;

import TestFramework.Asserts;

public class UseFixedStringStack {

    public static void main(String[] args) {

        FixedStringStack stack1 = new FixedStringStack(3);
        FixedStringStack stack2 = new FixedStringStack();

        testFixedStringStack(stack1);
        testFixedStringStack(stack2);
    }

    public static void testFixedStringStack(FixedStringStack stack) {

        Asserts.assertEquals(stack.getSize(), 0);
        Asserts.assertEquals(stack.toString(), "[]");
        Asserts.assertEquals(stack.isEmpty(), true);

        stack.push("one");
        stack.push("two");
        Asserts.assertEquals(stack.push("three"), true);
        Asserts.assertEquals(stack.push("four"), false);

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
