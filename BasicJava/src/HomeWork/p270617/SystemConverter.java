package HomeWork.p270617;


public class SystemConverter {


    private static final int MAXDIGIT = 36;

    public static String toBinaryString(int n) {
        return toString(n, 2);
    }

    public static String toHexString(int n) {
        return toString(n, 16);
    }

    public static String toOctalString(int n) { return toString(n, 8); }

    public static String toString(int n, int base) {
        if ( base <= 1 ) {
            System.err.println("Error: bad base.");
            return "1";
        }

        StringBuilder answer = new StringBuilder();

        if (n == 0)
            answer.append(0);

        while (n > 0) {
            answer.append(ConvertNumberToDigit(n % base));
            n /= base;
        }

        answer.reverse();

        return answer.toString();
    }

    private static char ConvertNumberToDigit(int number) {
        char ans = '0';

        if (number < 10)
            ans = (char) ('0' + number);
        else
            ans = (char) ('A' + (number - 10));

        return ans;
    }
}
