package thread.homework2;

/**
 * author Igor
 */
public class Handler {

    static String name;
    static int age;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Handler.name = name;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Handler.age = age;
    }

    public void printAge() {
        setAge(21);
        System.out.println("age: " + getAge());
    }

    public void printName() {

        setName("Alex");
        System.out.println("Name: " + getName());
    }
}
