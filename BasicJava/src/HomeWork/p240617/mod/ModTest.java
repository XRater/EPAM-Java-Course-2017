package HomeWork.p240617.mod;

import TestFramework.Asserts;

import static HomeWork.p240617.mod.Mod.mod;

public class ModTest {

    public static void main(String[] args) {

        for (int i = -10; i < 10; i++)
            for (int j = -10; j < 10; j++) {
                if (j == 0)
                    continue;
                Asserts.assertEquals(mod(i, j), i % j);
            }

    }

}
