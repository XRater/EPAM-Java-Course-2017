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

    public boolean isEmpty() {
        return size_ == 0;
    }

    public int getSize() {
        return size_;
    }

    public void push(String s) {

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
