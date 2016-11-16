package collections.workItea;

/**
 * author james
 */
public class Groy {


    private static Node tail;

    public static void main(String[] args) {

        tail = new Node<>(23, tail);
        System.out.println("is empty: " + isEmpty());

        add(95);
        add(23);
        System.out.println(print(tail));
        removeAll();
        System.out.println("is empty: " + isEmpty());
    }

    private static void removeAll() {

        tail = null;
    }

    private static int length(Node tail) {

        return (tail == null) ? 0 : 1 + length(tail.next);
    }

    private static <S> void add(S java) {

        tail = new Node<>(java, tail);
    }

    private static String print(Node top) {

        return (top == null) ? "end" : top.param + " | " + print(top.next);
    }

    private static boolean isEmpty() {

        return tail == null;
    }
}
