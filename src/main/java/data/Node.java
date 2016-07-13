package data;

class Node <I, S> {

    I value;
    S param;
    Node next;

    Node(I value, S param, Node next) {
        this.value = value;
        this.param = param;
        this.next = next;
    }
}
