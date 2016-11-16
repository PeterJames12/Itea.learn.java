package generics.homework;


public class Bank <I, S> {

    private Node<I, S> tail;

    public Bank(Node<I, S> tail) {
        this.tail = tail;
    }

    public void removeAll() {
        tail = null;
    }

    public int length() {
        return length(tail);
    }

    private int length(Node<I, S> tail) {
        return (tail == null) ? 0 : 1 + length(tail.getNext());
    }

    public void add(I value, S java) {

        tail = new Node<>(value, java, tail);
    }

    public String print() {
        return print(tail);
    }

    public String print(Node<I, S> top) {

        return (top == null) ? "end" : top.getValue() + " " + top.getParam() + " | " + print(top.getNext());
    }

    public boolean isEmpty() {
        return tail == null;
    }
}
