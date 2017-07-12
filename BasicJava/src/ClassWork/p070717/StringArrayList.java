package ClassWork.p070717;

import java.util.Arrays;

public class StringArrayList {

    private static final int DEFAULT_SIZE = 2;

    private int size_ = 0;
    static private String[] data_ = new String[DEFAULT_SIZE];


    public String get(int index) {
        return data_[index];
    }

    public void set(int index, String string) {
        data_[index] = string;
    }

    public int getSize() {
        return size_;
    }

    public boolean isEmpty() {
        return size_ == 0;
    }


    public void add(String string) {
        if (size_ == data_.length)
            data_ = Arrays.copyOf(data_, data_.length * 2);
        data_[size_++] = string;
    }


    public void remove(int index) {
        if (index < 0 || index >= size_)
            return;

        System.arraycopy(data_, index + 1, data_, index, size_ - index - 1);
        data_[--size_] = null;
    }


    public void remove(String string) {
        for (int index = 0; index < size_; index++)
            if (data_[index].equals(string)) {
                remove(index);
                return;
            }
    }


    @Override
    public String toString() {
        if (size_ == 0)
            return "[]";

        StringBuilder sb = new StringBuilder();

        sb.append('[');

        for (int i = 0; i < size_ - 1; i++)
            sb.append(data_[i].toString() + ", ");

        sb.append(data_[size_ - 1].toString());
        sb.append(']');

        return sb.toString();
    }

}
