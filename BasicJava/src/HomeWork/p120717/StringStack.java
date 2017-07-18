package HomeWork.p120717;

public class StringStack {

    private static final int DEFAULT_MAX_SIZE = 10;

    private final int maxSize;
    private int size_;

    String[] data_;

    public StringStack() {
        maxSize = DEFAULT_MAX_SIZE;
        data_ = new String[maxSize];
        size_ = 0;
    }

    public StringStack(int size) {
        maxSize = size;
        data_ = new String[maxSize];
        size_ = 0;
    }

    public boolean isEmpty() {
        return size_ == 0;
    }

    public int getSize() {
        return size_;
    }

    public boolean push(String s) {
        data_[size_++] = s;
        return true;
    }

    @Override
    public String toString() {
        if (size_ == 0)
            return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append('[');

        sb.append(data_[0]);
        for (int i = 1; i < size_; i++)
            sb.append(", ").append(data_[i]);

        sb.append(']');

        return sb.toString();
    }
}
