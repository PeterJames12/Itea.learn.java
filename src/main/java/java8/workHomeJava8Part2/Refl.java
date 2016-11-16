package java8.workHomeJava8Part2;

import java.util.function.*;

/**
 * Created by james on 16.07.16.
 */
public class Refl
{

    private static int age = 19;
    private static String name = "Peter";

    public static void main(String ... args) {

        System.out.println("Before");
        System.out.println("age: " + age);
        System.out.println("name: " + name);

        System.out.println("After");
        Supplier<Integer> functional = () -> age;
        System.out.println("age: " + functional.get());

        Supplier<String> generate = () -> name;
        System.out.println("name: " + generate.get());

//        comeBack(3333);

        Integer someNumber = 555555555;

        char[] mas = someNumber.toString().toCharArray();

        boolean result = false;
        for (int i = 0; i < mas.length - 1; i++) {
            if (mas[i] == mas[i + 1]) {
                result = true;
            } else {
                System.out.println(false);
                return;
            }
        }
        System.out.println(result);
    }

    private static int functional() {
        return age;
    }

    private static String  generate() {
        return name;
    }
}
