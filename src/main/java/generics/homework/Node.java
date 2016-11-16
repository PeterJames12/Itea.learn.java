package generics.homework;

class Node <I, S> {

    private I value;
    private S param;

    private Node<I, S> next;

    Node(I value, S param, Node next) {
        this.value = value;
        this.param = param;
        this.next = next;
    }

    public Node(I value, S param) {
        this.value = value;
        this.param = param;
    }

    public Node<I, S> getNext() {
        return next;
    }

    public I getValue() {
        return value;
    }

    public void setValue(I value) {
        this.value = value;
    }

    public S getParam() {
        return param;
    }

    public void setParam(S param) {
        this.param = param;
    }
}
