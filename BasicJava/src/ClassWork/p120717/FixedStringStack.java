package ClassWork.p120717;

import static ClassWork.p120717.UseFixedStringStack.testFixedStringStack;

public class FixedStringStack {

    private static final int DEFAULT_MAX_SIZE = 3;
    private final String[] data_;
    private int size_;
    private final int maxSize_;

    public FixedStringStack() {
        this(DEFAULT_MAX_SIZE);
    }

    public FixedStringStack(int maxSize) {
                data_ = new String[maxSize];
        size_ = 0;
        maxSize_ = maxSize;
    }

    public int getSize() {
        return size_;
    }

    public boolean isEmpty() {
        return size_ == 0;
    }

    public boolean push(String string) {
        if (size_ == maxSize_)
            return false;

        data_[size_++] = string;
        return true;
    }

    public String top() {
        if (size_ == 0)
            return null;

        return data_[size_ - 1];
    }

    public String pop() {
        if (size_ == 0)
            return null;

        String ans = top();
        data_[--size_] = null;
        return ans;
    }

    @Override
    public String toString() {
        if (size_ == 0)
            return "[]";

        StringBuilder sb = new StringBuilder();

        sb.append('[');

        for (int i = 0; i < size_ - 1; i++)
            sb.append(data_[i]).append(", ");

        sb.append(data_[size_ - 1]);
        sb.append(']');

        return sb.toString();
    }


    public static void main(String[] args) {
        FixedStringStack stack = new FixedStringStack(3);
        
        testFixedStringStack(stack);
    }
}
