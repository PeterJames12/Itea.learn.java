package generics;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * author james
 */
public class User {

    private static String name;
    private static int age;

    public static void main(String[] args) {

        someMethod("Hello");
    }

    private static void someMethod(String hello) {
        System.out.println(hello);

        new User().set();
    }

    public  void set() {
        setName("Alex");
        setAge(21);
        String name = getName();
        int age = getAge();
        System.out.println(name);
        System.out.println(age);
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        User.name = name;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        User.age = age;
    }
}
