package ClassWork.p120717;


import ClassWork.p070717.StringArrayList;

import static ClassWork.p120717.UseStack.testStringStack;

public class StringStack {

    private StringArrayList data_ = new StringArrayList();

    public int getSize() {
        return data_.getSize();
    }

    public boolean isEmpty() {
        return data_.isEmpty();
    }

    public void push(String string) {
        data_.add(string);
    }

    public String top() {
        if (data_.getSize() == 0)
            return null;
        return data_.get(data_.getSize() - 1);
    }

    public String pop() {
        String value = top();
        data_.remove(data_.getSize() - 1);
        return value;
    }

    @Override
    public String toString() {
        return data_.toString();
    }

    public static void main(String[] args) {
        testStringStack();
    }
}

