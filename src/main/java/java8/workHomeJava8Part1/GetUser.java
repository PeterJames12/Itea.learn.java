package java8.workHomeJava8Part1;


import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;

public class GetUser {

    public static void main(String[] args) {

        User alex = new User("Alex", 23);
        User igor = new User("Igor", 21);

        Collection<Integer> ages = ages(User::getAge, alex, igor);
        Collection<String> names = names(User::getName, alex, igor);

        Collection<String> universalNames = universal(User::getName, igor, alex);
        Collection<Integer> universalAges = universal(User::getAge, igor, alex);

        System.out.println("Ages");
        ages.forEach(System.out::println);
        System.out.println("Names");
        names.forEach(System.out::println);

        System.out.println("universal");
        universalNames.forEach(System.out::println);
        universalAges.forEach(System.out::println);

    }

    private static <T> Collection<T> universal(Function<User, T> instruction, User ... userAge) {

        Collection<T> allUsers = new ArrayList<>();

        for (User users : userAge) {

            allUsers.add(instruction.apply(users));
        }
        return allUsers;
    }


    private static Collection<String> names(Function<User, String > instruction, User ... userAge) {

        Collection<String> allUsers = new ArrayList<>();

        for (User users : userAge) {

            allUsers.add(instruction.apply(users));
        }
        return allUsers;
    }


    private static Collection<Integer> ages(Function<User, Integer> instruction, User ... userAge) {

        Collection<Integer> allUsers = new ArrayList<>();

        for (User users : userAge) {

            allUsers.add(instruction.apply(users));
        }
        return allUsers;
    }

    private static class User {

        final int age;
        final String name;

        private User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Integer getAge() {
            return age;
        }

        public String getName() {
            return name;
        }
    }
}


