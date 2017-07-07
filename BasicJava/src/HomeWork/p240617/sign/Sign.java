package HomeWork.p240617.sign;

import TestFramework.Asserts;

public class Sign {

    public static int sign(int n) {
        int answer = 0;

        if (n > 0)
            answer = 1;
        if (n < 0)
            answer = -1;

        return answer;
    }

}
