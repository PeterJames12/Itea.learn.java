package java8.workHomeJava8Part1;

@FunctionalInterface
public interface ISomeInterface {

    void consumer(int age);

    default void defMethod() {
        System.out.println("I'm default Method");
    }
}
