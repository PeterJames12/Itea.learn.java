package data;


public class Bank {

    private static Node tail;

    public static void main(String[] args) {

        tail = new Node(23, "Better", tail);
        System.out.println("is empty: " + isEmpty());

        add(95, "Java");
        add(23, "Linux");
        add("Linux", "Arch");
        add(17, "KPI");

        System.out.println("length: " + length(tail));
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

    private static <I, S> void add(I value, S java) {

        tail = new Node(value, java, tail);
    }

    private static String print(Node top) {

        return (top == null) ? "end" : top.value + " " + top.param + " | " + print(top.next);
    }

    private static boolean isEmpty() {

        return tail == null;
    }
}
