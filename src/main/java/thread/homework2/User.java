package thread.homework2;

import java.util.*;

/**
 * author Igor
 */
public class User extends Handler {

    private static List<String> list = new LinkedList<>();


    public static void main(String[] args) {

        list.add("java");
        list.add("linux");
        list.add("arch");

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < list.size(); i++) {
            stringBuilder.append(list.get(i));
        }
        String s = stringBuilder.toString();
        System.out.println(s);

        char[] chars = s.toCharArray();
        int result = 0;
        for (int i = 0; i < chars.length; i++) {
            result += Character.codePointAt(chars, i);
        }
        System.out.println(result);
    }
}