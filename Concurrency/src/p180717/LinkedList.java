package p180717;

public class LinkedList<E> {

    static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;
    }

    Node first;
    Node last;

    public void add (E item) {
        Node<E> node = new Node<>();
        node.item = item;
        node.next = null;
        node.prev = last;
        if (first == null) {
            first = node;
        } else {
            last.next = node;
        }
        last = node;
    }

    public void print() {
        for (Node<E> current = first; current != null; current = current.next)
            System.out.println(current.item);
    }
}
