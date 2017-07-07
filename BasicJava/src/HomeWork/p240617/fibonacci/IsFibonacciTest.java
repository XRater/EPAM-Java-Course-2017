package HomeWork.p240617.fibonacci;

import TestFramework.Asserts;

public class IsFibonacciTest {

    public static void main(String[] args) {

        Asserts.assertEquals(IsFibonacci.isFibonacci(0), true);
        Asserts.assertEquals(IsFibonacci.isFibonacci(1), true);
        Asserts.assertEquals(IsFibonacci.isFibonacci(2), true);
        Asserts.assertEquals(IsFibonacci.isFibonacci(3), true);
        Asserts.assertEquals(IsFibonacci.isFibonacci(4), false);
        Asserts.assertEquals(IsFibonacci.isFibonacci(5), true);
        Asserts.assertEquals(IsFibonacci.isFibonacci(6), false);
        Asserts.assertEquals(IsFibonacci.isFibonacci(100), false);
        Asserts.assertEquals(IsFibonacci.isFibonacci(144), true);

    }

}
