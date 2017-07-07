package HomeWork.p240617.fibonacci;

public class IsFibonacci {

    static boolean isFibonacci(int n) {
        if (n < 0)
            return false;
        if (n == 0)
            return true;

        int last = 0, cur = 1;
        while (cur < n) {
            int tmp = cur;
            cur += last;
            last = tmp;
        }

        return cur == n;
    }
}
