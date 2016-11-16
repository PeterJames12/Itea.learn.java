package java8.workIteaPart2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * author Igor
 */
public class Flight {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("linux", "Java", "Arch");

        StringBuilder stringBuilder = new StringBuilder();

        for (String aList : list) {
            stringBuilder.append(aList);
        }

        String joyrnali = stringBuilder.toString();

        char[] chars = joyrnali.toCharArray();

        int buff = 0;

        for (int i = 0; i < chars.length; i++) {
            buff += Character.codePointAt(chars, i);
        }
        System.out.println(buff);

        Optional<Integer> reduce = list.stream().flatMap(s -> s.chars().boxed()).reduce((s, b) -> s + b);
        System.out.println(reduce);

    }
}
