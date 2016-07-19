package java8.homework;

import java.util.*;
import java.util.stream.Collectors;

public class Encryption {

    public static void main(String[] args) {

        giveMeSomeNumber(112, 123);
    }

    private static void giveMeSomeNumber(Integer from, Integer to) {

        List<Integer> generate = generate(from, to);

        String result = generate.stream().filter(s -> s > 0).map(Character::toChars).map(Encryption::myToString).collect(Collectors.joining());
        System.out.println(result);
    }

    private static String myToString(char[] chars) {

        StringBuilder stringBuilder = new StringBuilder();

        for (char ch : chars) {
            stringBuilder.append(ch);
        }
        return stringBuilder.toString();
    }

    private static List<Integer> generate(Integer from, Integer to) {

        List<Integer> generate = new LinkedList<>();

        for (int i = from; i < to; i++) {
            generate.add(i);
        }
        return generate;
    }
}
