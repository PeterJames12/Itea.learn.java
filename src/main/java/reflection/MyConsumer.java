package reflection;

/**
 * author Igor
 */
public interface MyConsumer {

    int summer();

    String name();

    default void good() {
        System.out.println("Hello");
    }



}
