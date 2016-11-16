package java8.workHomeJava8Part2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Optional;

/**
 * author Igor
 */
public class GetOptional {


    public static void main(String[] args) {

        Collection<Integer> justNumber = new ArrayList<>();

        justNumber.add(1);
        Collection<String> justName = new ArrayList<>();
        justName.add("Igor");
        justName.add("Antil");

//        generateException(justName);
        generateException(justNumber, justName);

    }

    private static void generateException(Collection<Integer> justName, Collection<String> listName) {

        Integer reduce = justName.stream().filter(s -> s > 0).reduce(Integer::min).orElse(-1);

        System.out.println(reduce);

        System.out.println(listName.stream().flatMap(s -> s.chars().boxed()).reduce((u, k) -> u + k).orElse(-1));

        Iterator<String> iterator = listName.iterator();

        StringBuilder stringBuilder = new StringBuilder();
        while (iterator.hasNext()) {
            stringBuilder.append(iterator.next());
        }

        String conkatenatcia = stringBuilder.toString();

        char[] chars = conkatenatcia.toCharArray();

        int result = 0;
        for (int i = 0; i < chars.length; i++) {
            result += Character.codePointAt(chars, i);
        }
        System.out.println(result);

    }
}
