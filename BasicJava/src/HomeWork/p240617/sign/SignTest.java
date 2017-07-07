package HomeWork.p240617.sign;

import TestFramework.Asserts;

public class SignTest {

    public static void main(String[] args) {

        Asserts.assertEquals(Sign.sign(1), 1);
        Asserts.assertEquals(Sign.sign(-1), -1);
        Asserts.assertEquals(Sign.sign(0), 0);
        Asserts.assertEquals(Sign.sign(2), 1);
        Asserts.assertEquals(Sign.sign(-17), -1);

    }

}
