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

    public boolean push(String string) {
        if (this.size_ == this.maxSize_)
            return false;

        this.data_[this.size_++] = string;
        return true;
    }

    public String top() {
        if (this.size_ == 0)
            return null;

        return data_[this.size_ - 1];
    }

    public String pop() {
        if (this.size_ == 0)
            return null;

        String ans = top();
        this.data_[--this.size_] = null;
        return ans;
    }

    @Override
    public String toString() {
        if (this.size_ == 0)
            return "[]";

        StringBuilder sb = new StringBuilder();


        sb.append('[');

        for (int i = 0; i < this.size_ - 1; i++)
            sb.append(this.data_[i]).append(", ");

        sb.append(this.data_[this.size_ - 1]);
        sb.append(']');

        return sb.toString();
    }


    public static void main(String[] args) {
        FixedStringStack stack = new FixedStringStack(3);
        
        testFixedStringStack(stack);
    }
}
