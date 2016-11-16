package reflection;

import java.util.Random;
import java.util.function.*;

/**
 * author Igor
 */
public class Jav8 {

    public static void main(String[] args) {

        Consumer<Integer> consumer = System.out::println;
        consumer.accept(15);
        consumer.accept(14);

        Supplier<String> supplier = () -> "Hello";
        System.out.println(supplier.get());

        UnaryOperator<Integer> unaryOperator = s -> s + 10;
        System.out.println(unaryOperator.apply(12));

        Random random = new Random();
        int counter = random.nextInt(22);

        Consumer<Integer> rand = System.out::println;
        rand.accept(counter);

        BinaryOperator<Integer> binaryOperator = (s, b) -> s + b;

        System.out.println(binaryOperator.apply(1, 32));

        BiFunction<Integer, Integer, String> biFunction = (key, value) -> "Hello";
        System.out.println(biFunction.apply(12, 12));

        Predicate<Integer> predicate = s -> s != 0;
        System.out.println(predicate.test(12));

        BiConsumer<Integer, String> biConsumer = (a, s) -> System.out.println(a + s);

        biConsumer.accept(1, " Hello");
        BiPredicate<Integer, Integer> biPredicate = (a, b) -> a % b == 0;
        System.out.println(biPredicate.test(2, 1));
    }




}
