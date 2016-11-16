package thread.homework2;

/**
 * author Igor
 */
public class Folder {

    public static void main(String[] args) {

        doSomething();
    }

    private static void doSomething() {

        String address = "Stockholm Sweden";
        String format = "%s is %s, lives in %s age %s";
        System.out.println(String.format(format, "Nils", "a good friend", address, 30));
    }
}