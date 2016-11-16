package thread.workItea2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * author Igor
 */
public class Service {

    private static String name = "Alex";

   private static final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    public static void main(String[] args) {

        new Thread(Service::good).start();
        new Thread(Service::changeField).start();
    }

    private static void good() {

        for (int i = 0; i < 25; i++) {
            System.out.println(name);
        }
    }


    private static void bad() {

        Thread thread = new Thread(Service::changeField);
        thread.start();
    }

    private static void changeField() {
        try {
            Thread.sleep(5_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        readWriteLock.writeLock().lock();
        name = "Bob";
    }

    private static void print() {
        System.out.println(name);

    }
}
