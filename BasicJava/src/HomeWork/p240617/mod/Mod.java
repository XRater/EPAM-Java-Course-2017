package HomeWork.p240617.mod;

import static HomeWork.p240617.sign.Sign.sign;

public class Mod {

    static int mod(int a, int b) {
        int value = 0;

        if (b == 0)
            System.err.println("Zero value passed.");
        else
            value = unsigned_mod(unsigned(a), unsigned(b));

        return value * sign(a);
    }

    private static int unsigned(int a) {
        return a * sign(a);
    }

    private static int unsigned_mod(int a, int b) {
        int r = a;

        while (r >= b)
            r -= b;

        return r;
    }
}
