package thread.homework;

import lombok.Data;
import lombok.SneakyThrows;
import lombok.val;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.IntStream;

/**
 * author Igor
 */
@Data
public class Single {

    private static List<Integer> list = new LinkedList<>();

    public static void main(String[] args) {

        Consumer<String> consumer = System.out::println;
        consumer.accept("Java");

        // Supplier<Integer> supplier = Single::linux;
        // System.out.println(supplier.get());
    }

    @SneakyThrows
    private static Integer linux() throws InterruptedException {

        IntStream.rangeClosed(1, 12).forEach(list::add);

        return list.stream()
                .filter(s -> s % 2 == 0)
                .reduce(Integer::max)
                .orElseThrow(InterruptedException::new);
    }
}
