package summer;

/**
 * author Igor
 */
public class LearnStatic {

    private static class User {

        public static String name;
        public int age;

        public User(int age) {
            this.age = age;
        }

        public static String getName() {
            return name;
        }

        public static void setName(String name) {
            User.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    private static class Main {

        public static void main(String[] args) {

            User user = new User(12);
            System.out.println(user.getAge());
            user.setAge(21);
            System.out.println(user.getAge());

            User.setName("Alex");
            System.out.println(User.getName());
        }
    }
}
