package java8.workIteaPart2;


import java.util.*;

import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * author Igor
 */
public class Chummy {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("Itea");
        words.add("Itea");
        words.add("Itea");
        words.add("linux");
        words.add("java");
        words.add("great");
        words.add("great!");
        words.add("!great!");

        /*MyStream.of(words).filter(s -> !s.equals("Itea")).
                filter(s -> !s.contains("!")).
                collect(Collectors.toList()).forEach(System.out::println);*/

        List<String> itea = words.stream().
                filter(s -> !s.equals("Itea")).
                filter(s -> !s.contains("!")).
                collect(Collectors.toList());
        System.out.println("Itea: " + itea);

        List<Integer> sortNumbers = Arrays.asList(1, 5, 6, 2, 5, 2, 2);

        sortNumbers.sort(Integer::compare);
        System.out.println("sortNumbers: " + sortNumbers);

        List<String> list = Arrays.asList("java", "Linux", "Arch");

        String maxString = list.stream().max(String::compareTo).get();
        String minString = list.stream().min(String::compareTo).get();
        List<Integer> lengthStings = list.stream().map(String::length).sorted(Integer::compare).collect(Collectors.toList());
        System.out.println("maxString: " + maxString);
        System.out.println("minString: " + minString);

        System.out.println("sort: " + lengthStings);

        String collect = list.stream().collect(Collectors.joining());
        System.out.println("joining: " + collect);
        int result = 0;
        char[] chars = collect.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            result += Character.codePointAt(chars, i);
        }
        System.out.println("sum unicode: " + result);

        Optional<Integer> reduce = list.stream().flatMap(s -> s.chars().boxed()).reduce((a, b) -> a + b);
        System.out.println("sum unicode optional: " + reduce);

        List<Integer> generateStringFromInteger = Arrays.asList(-1, 5, 5, 3, 12);

        Function<Integer, String> generate = Chummy::generate;
        generateStringFromInteger.stream()
                .filter(s -> s > 0)
                .map(generate).forEach(System.out::println);

//        generateStringFromInteger.stream().map(value -> value).collect(() -> HashSet::new, HashSet::addAll); i don't know

        List<Integer> numbers = Arrays.asList(-1, 1, 2, 3, 5, 4, -10, -1);

        Integer integer = numbers.stream()
                .skip(1)
                .limit(5)
                .filter(a -> a > 0).reduce(Integer::min)
                .orElseThrow(ArrayIndexOutOfBoundsException::new);

        System.out.println("integer > 0 and also min value: " + integer);

        List<Integer> summersen = Arrays.asList(1, 5, 4, 8, 4, 9, 4, 9, 10);

        Integer uSortFromTail = summersen.stream()
                .filter(value -> value > 0)
                .distinct()
                .sorted((value, s) -> s.compareTo(value))
                .filter(s -> s == 10)
                .reduce(Integer::min).orElseThrow(ArrayIndexOutOfBoundsException::new);

        System.out.println(uSortFromTail);

    }

    private static String generate(Integer amount) {

         StringBuilder stringBuffer = new StringBuilder();

        for (int i = 0; i < amount; i++) {
            stringBuffer.append("s");
        }
        return stringBuffer.toString();
    }
}
