package HomeWork.p240617.prime;

import static sun.util.calendar.CalendarUtils.mod;

public class IsPrime {

    static boolean is_prime(int n) {
        boolean answer = true;

        for (int i = 2; i < n; i++)
            if (mod(n, i) == 0)
                answer = false;

        return answer && (n != 1);
    }
}
