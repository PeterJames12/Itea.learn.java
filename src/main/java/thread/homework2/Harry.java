package thread.homework2;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * author Igor
 */
public class Harry {

    private static List<Integer> first = new LinkedList<>();
    private static List<Integer> second = new LinkedList<>();
    private static Random random = new Random();

    public static void main(String[] args) {

        add();
        sort();
    }

    private static void add() {

        int length = 1 + random.nextInt(25);

        for (int i = 0; i < length; i++) {
            int elementFirst = 1 + random.nextInt(32);
            first.add(elementFirst);
            int elementSecond = 1 + random.nextInt(32);
            second.add(elementSecond);
        }
    }

    private static void sort() {

        first.stream().sorted().forEach(System.out::println);

        second.stream().sorted().forEach(System.out::println);
    }
}
