package HomeWork.p040717;

class Digits {

    private final int SIZE = 9;
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
}
