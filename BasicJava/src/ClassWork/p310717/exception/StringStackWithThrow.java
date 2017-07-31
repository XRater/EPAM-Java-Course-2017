package ClassWork.p310717.exception;

public class StringStackWithThrow {

    public static class Overflow extends Exception {

        private final int size;

        public Overflow(int size) {
            this.size = size;
        }

        public int getSize() {
            return size;
        }
    }

    private static final int DEFAULT_MAX_SIZE = 3;
    private final String[] data_;
    private int size_;
    private final int maxSize_;

    public StringStackWithThrow() {
        this(DEFAULT_MAX_SIZE);
    }

    public StringStackWithThrow(int maxSize) {
        this.data_ = new String[maxSize];
        this.size_ = 0;
        this.maxSize_ = maxSize;
    }

    public int getSize() {
        return this.size_;
    }

    public boolean isEmpty() {
        return this.size_ == 0;
    }

    public boolean push(String string) throws Exception {

        if (string == null) {
            throw new IllegalAccessException("Nulls are not allowed");
        }

        if (this.size_ == this.maxSize_) {
            throw new Overflow(size_);
        }

        this.data_[this.size_++] = string;
        return true;
    }

    public String top() {
        if (this.size_ == 0) {
            return null;
        }

        return data_[this.size_ - 1];
    }

    public String pop() {
        if (this.size_ == 0) {
            return null;
        }

        String ans = top();
        this.data_[--this.size_] = null;
        return ans;
    }

    @Override
    public String toString() {
        if (this.size_ == 0) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();


        sb.append('[');

        for (int i = 0; i < this.size_ - 1; i++) {
            sb.append(this.data_[i]).append(", ");
        }

        sb.append(this.data_[this.size_ - 1]);
        sb.append(']');

        return sb.toString();
    }
}
