package reflection;

import java.util.*;
import java.util.stream.IntStream;

/**
 * author Igor
 */

public class Producer {

   private static int buff1;


    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        IntStream.rangeClosed(1, 12)
                .forEach(list::add);

        List<String> number = new ArrayList<>();

        StringBuilder stringBuilder = new StringBuilder();




        list.forEach(stringBuilder::append);

        String buff = stringBuilder.toString();

        System.out.println(buff);

        number.add(buff);

        for (int i = 1; i < list.size(); i++) {
            int x = i;
            number.stream().filter(s -> !s.contains(String.valueOf(x))).forEach(s -> System.out.println(x));
        }
    }
}
