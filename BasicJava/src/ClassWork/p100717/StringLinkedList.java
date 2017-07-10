package ClassWork.p100717;

public class StringLinkedList {

    private int size_;
    private Node head;
    private Node tail;

    public void add(String value) {
        final Node node = new Node(value);

        if (size_ == 0)
            head = tail = node;
        else
            tail.setNext(node);

        tail = node;

        size_++;
    }

    public int getSize() {
        return size_;
    }

    public boolean isEmpty() {
        return size_ == 0;
    }


    public boolean remove(String string) {

        boolean result = false;

        Node current = head;
        Node prev = null;
        while (current != null) {

            if (current.getValue().equals(string)) {
                if (prev == null) {
                    head = current.getNext();
                    if (size_ == 1)
                        tail = null;
                } else {
                    prev.setNext(current.getNext());
                }
                size_--;
                result = true;
                break;
            }

            prev = current;
            current = current.getNext();
        }

        return result;
    }


    @Override
    public String toString() {
        if (size_ == 0) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append(head.getValue());

        //traverse
        for (Node node = head.getNext(); node != null; node = node.getNext())
            sb.append(", " + node.getValue());

        sb.append(']');

        return sb.toString();
    }

    public static void main(String[] args) {
        StringLinkedListUse.test();
    }
}
