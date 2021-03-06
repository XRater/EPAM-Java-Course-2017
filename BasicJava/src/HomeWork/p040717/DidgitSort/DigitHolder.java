package HomeWork.p040717.DidgitSort;

import TestFramework.Asserts;

import java.util.Random;

class DigitHolder {

    private static final int TEST_NUMBER = 1000;

    static final int SIZE = 11;

    private final int[] digits_ = new int[SIZE];
    private int length_;

//    Constructor from integer number. Fills unused space of digits_ with zeroes
    public DigitHolder(int number) {
        for (int i = 0; i < SIZE; i++) {
            if (number != 0)
                length_++;
            digits_[i] = number % 10;
            number /= 10;
        }
    }

    public int get(int index) {
        return digits_[index];
    }

    @Override
    public String toString() {
        if (length_ == 0)
            return "0";

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length_; i++)
            sb.append(digits_[i]);

        return sb.reverse().toString();
    }

    //Some tests
    public static void main(String[] args) {

        Random random = new Random();
        for (int i = 0; i < TEST_NUMBER; i++) {
            int value = random.nextInt(Integer.MAX_VALUE);

            Integer val = value;
            DigitHolder d = new DigitHolder(value);

            Asserts.assertEquals(d.toString(), val.toString());
        }

    }

}
