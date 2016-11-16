package thread.homework2;

import lombok.SneakyThrows;
import lombok.val;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * author Igor
 */
public class SimpleThread {

    private static List<Integer> list = new ArrayList<>();

    @SneakyThrows
    public static void main(String[] args) {

        Thread thread = new Thread(SimpleThread::write);
        thread.start();
        thread.join();
        new Thread(SimpleThread::read).start();
    }

    private static void write() {
        IntStream.rangeClosed(1, 12).forEach(list::add);
    }

    private static void read() {
        list.forEach(System.out::println);
    }
}
