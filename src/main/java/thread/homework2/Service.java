package thread.homework2;

/**
 * author Igor
 */
public class Service {

    public static void main(String[] args) throws InterruptedException {

        final Thread mainThread = Thread.currentThread();
        Thread thread = new Thread(() -> run(mainThread));
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
        Thread.sleep(1_000);
        System.out.println(thread.getState());
        printMe(thread, true);
        Thread.sleep(1_000);
        System.out.println(thread.getState());
    }

    private static void run(final Thread thread) {
        try {
            Thread.sleep(4_000);
            printMe(Thread.currentThread(), false);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 10000; i++) {
            i++;
        }
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static synchronized void printMe(Thread thread, boolean print) {
        try {
            if (print) {
                Thread.sleep(10_000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (print) {
            System.out.println(thread.getState());
        }
    }
}
