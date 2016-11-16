package collections.workItea;

/**
 * author james
 */
public class Node <S> {

    S param;
    Node next;

    Node(S param, Node next) {
        this.param = param;
        this.next = next;
    }
}
