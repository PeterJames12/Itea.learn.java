package data;


public class Bank {

    private static Node tail;
    private static int result = 0;

    public static void main(String[] args) {

        tail = new Node(12, "Create own Node", tail);
        System.out.println("is empty: " + isEmpty());

        add(95, "Java");
        add(21, "Linux");
        add(23, "Arch");
        add(17, "KPI");

        System.out.println("length: " + length(tail));
        System.out.println(print(tail));
        removeAll();
        System.out.println("is empty: " + isEmpty());
        System.out.println(maxElement(tail));
        System.out.println(minElement(tail));
    }

    private static int minElement(Node top) {
        if (top != null) {
            if (top.value < result) {
                result = top.value;
            }
            minElement(top.next);
        }
        return result;
    }

    private static int maxElement(Node top) {
        if (top != null) {
            if (top.value > result) {
                result = top.value;
            }
            maxElement(top.next);
        }
        return result;
    }

    private static void removeAll() {

        tail = null;
    }

    private static int length(Node tail) {

        return (tail == null) ? 0 : 1 + length(tail.next);
    }

    private static void add(int value, String java) {

        tail = new Node(value, java, tail);
    }

    private static String print(Node top) {

        return (top == null) ? "end" : top.value + " " + top.param + " | " + print(top.next);
    }

    private static boolean isEmpty() {

        return tail == null;
    }
}
