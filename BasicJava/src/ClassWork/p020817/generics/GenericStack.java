package ClassWork.p020817.generics;

class GenericStack<E> {

    private static final int DEFAULT_MAX_SIZE = 3;
    private final E[] data;
    private int size;
    private final int maxSize;

    public GenericStack() {
        this(DEFAULT_MAX_SIZE);
    }

    public GenericStack(int maxSize) {
        this.data = (E[]) new Object[maxSize];
        this.size = 0;
        this.maxSize = maxSize;
    }

    public int getSize() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean push(E element) {
        if (this.size == this.maxSize) {
            return false;
        }

        this.data[this.size++] = element;
        return true;
    }

    public E top() {
        if (this.size == 0) {
            return null;
        }

        return data[this.size - 1];
    }

    public E pop() {
        if (this.size == 0) {
            return null;
        }

        E ans = top();
        this.data[--this.size] = null;
        return ans;
    }

    @Override
    public String toString() {
        if (this.size == 0) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();


        sb.append('[');

        for (int i = 0; i < this.size - 1; i++) {
            sb.append(this.data[i].toString()).append(", ");
        }

        sb.append(this.data[this.size - 1].toString());
        sb.append(']');

        return sb.toString();
    }

}
