package HomeWork.p240617.prime;

import TestFramework.Asserts;

public class IsPrimeTest {

    public static void main(String[] args) {

        Asserts.assertEquals(IsPrime.is_prime(1), false);
        Asserts.assertEquals(IsPrime.is_prime(2), true);
        Asserts.assertEquals(IsPrime.is_prime(3), true);
        Asserts.assertEquals(IsPrime.is_prime(4), false);
        Asserts.assertEquals(IsPrime.is_prime(5), true);
        Asserts.assertEquals(IsPrime.is_prime(6), false);
        Asserts.assertEquals(IsPrime.is_prime(7), true);

    }

}
