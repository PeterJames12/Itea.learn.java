package java8.workHomeJava8Part1;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ExtraClassesJava8 {

    public static void main(String[] args) {

        IPrinterBar iPrinterBar = () -> System.out.println("bar");

        iPrinterBar.print();
        iPrinterBar.printNoBar();

        Predicate<Integer> predicate = arg -> arg != 0;
        printNumber(predicate, 5);
        printNumber(ExtraClassesJava8::predicateFunction);

        Collection<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(8);
        numbers.add(12);
        numbers.add(3);
        numbers.add(23);
        numbers.add(17);
        numbers.add(-2);
        numbers.add(-4);

        Collection<Integer> filtered;
        filtered = filter(numbers, collectionsElement -> collectionsElement > 0);
        filtered.forEach(System.out::println);
    }

    private static <T> Collection<T> filter(Collection<T> numbers, Predicate<T> predicate) {

        List<T> filteredNumbers = numbers.stream().filter(predicate::test).collect(Collectors.toList());

//        List<T> filteredNumbers = numbers.stream().filter(t -> predicate.test(t)).collect(Collectors.toList());

        return filteredNumbers;
    }

    private static void printNumber(Predicate<Integer> predicate, Integer... numbers) {

        for (Integer number : numbers) {
            if (predicate.test(number)) {
                System.out.println(number);
            }
        }
    }

    private static boolean predicateFunction(Integer funk) {
        return funk > 0;
    }
}
