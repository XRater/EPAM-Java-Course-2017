package HomeWork.p040717;

import TestFramework.Asserts;

import java.util.Random;

class Digits {

    private static final int TEST_NUMBER = 1000;

    private final int SIZE = 11;
    private final int[] digits_ = new int[SIZE];
    private int length_;

    public Digits(int number) {
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

    public static void main(String[] args) {

        Random random = new Random();
        for (int i = 0; i < TEST_NUMBER; i++) {
            int value = random.nextInt(Integer.MAX_VALUE);

            Integer val = value;
            Digits d = new Digits(value);

            Asserts.assertEquals(d.toString(), val.toString());
        }

    }

}
