package java8.workHomeJava8Part1;


import java.util.function.*;

public class GetInterface {

    public static void main(String[] args) {

        Consumer<Integer> consumerPrintAge = (System.out::println);
        Consumer<String> consumerPrintNames = (System.out::println);

        consumerPrintNames.accept("Igor");
        consumerPrintNames.accept("Tatiania");

        consumerPrintAge.accept(21);
        consumerPrintAge.accept(20);

        Supplier<String> supplier = () -> "supplier";
        System.out.println(supplier.get());

        UnaryOperator<String> unaryOperator = (a) -> "unaryOperator";
        System.out.println(unaryOperator.apply("unaryOperator"));

        Function<Integer, String> function = a -> "function";
        System.out.println(function.apply(1));

        Predicate<Integer> predicate = (a) -> a != null;
        System.out.println(predicate.test(5));

        BinaryOperator<String> binaryOperator = (f, s) -> f = s.toUpperCase();
        BinaryOperator<Integer> binaryOperatorInteger = (f, s) -> f = s += f;
        System.out.println(binaryOperatorInteger.apply(2, 2));
        System.out.println(binaryOperator.apply("first", "second"));

        ISomeInterface some = (a) -> System.out.println(a + 5);
        some.consumer(12);
        some.defMethod();

        BiFunction<Integer, Integer, Integer> biFunction = (a, s) -> s + a;

    }
}
