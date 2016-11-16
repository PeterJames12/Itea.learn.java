package thread.homework2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * author Igor
 */
public class App {

    private final static Lock lock = new ReentrantLock(true);

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            new Thread(App::concurrentDemo).start();
        }
    }

    private static void concurrentDemo() {

        System.out.println(Thread.currentThread().getName() + " entered");
        lock.lock();
        printNumbers();
        System.out.println(Thread.currentThread().getName() + " exit");
    }

    private static void printNumbers() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        lock.unlock();
    }
}
