import java.util.Random;

/**
 * author Igor
 */
public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        int i = random.nextInt(9);
        some();
        System.out.println(some(i));

    }

    private static void some() {
        System.out.println("Hello");

    }

    private static int some(int i) {

        return i;
    }

    private static class Teacher {

        final int AGE = 29;

    }

    private static class Director {
        public static void main(String[] args) {
            Teacher teacher = new Teacher();
            System.out.println(teacher.AGE);
        }
    }
}