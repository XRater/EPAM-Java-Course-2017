package HomeWork.p120717;

public class StringStack {

    private static final int DEFAULT_MAX_SIZE = 10;

    private final int maxSize;
    private int size;

    String[] data;

    public StringStack() {
        this(DEFAULT_MAX_SIZE);
    }

    public StringStack(int size) {
        maxSize = size;
        data = new String[maxSize];
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public String top() {
        if (size == 0)
            return null;
        return data[size - 1];
    }

    public boolean push(String s) {
        if (size == maxSize)
            return false;
        data[size++] = s;
        return true;
    }

    public String pop() {
        if (size == 0)
            return null;

        String answer = top();
        data[--size] = null;
        return answer;
    }

    @Override
    public String toString() {
        if (size == 0)
            return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append('[');

        sb.append(data[0]);
        for (int i = 1; i < size; i++)
            sb.append(", ").append(data[i]);

        sb.append(']');

        return sb.toString();
    }
}
