package java8.workHomeJava8Part1;


public interface IPrinterBar {

    default void print() {
        System.out.println("barkaster");
    }

    void printNoBar();
}
