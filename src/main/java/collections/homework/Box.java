package collections.homework;


public class Box <L, R> {

    private BiNode<L, R> next;

    public Box(BiNode<L, R> next) {
        this.next = next;
    }

    public void removeAll() {
        next = null;
    }

    public int length() {
        return length(next);
    }

    private int length(BiNode<L, R> tail) {
        return (tail == null) ? 0 : 1 + length(tail.getNext());
    }

    public void add(L left, R right) {

        next = new BiNode<>(left, right, next);
    }

    public String print() {
        return print(next);
    }

    public String print(BiNode<L, R> top) {

//        top = new BiNode<>(top.getLeft(), top.getRight(), top.getNext());

        return (top == null) ? "end" : top.getLeft() + " " + top.getRight() + " | " + print(top.getNext());
    }

    public boolean isEmpty() {
        return next == null;
    }
}
