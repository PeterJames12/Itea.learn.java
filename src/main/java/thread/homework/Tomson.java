package thread.homework;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

/**
 * author Igor
 */
public class Tomson {

    private final static Lock lock = new ReentrantLock();

    public static void main(String[] args) {

        MyAwesome tomson = new MyAwesome();
        for (int i = 0; i < 5; i++) {

            new Thread(tomson::concorruntDemo).start();
        }

    }
    private static class MyAwesome {

        private void concorruntDemo() {

            System.out.println(Thread.currentThread().getName() + "entered.");
            lock.lock();
            printNumbers();
            System.out.println(Thread.currentThread().getName() + "exit.");
        }

        private void printNumbers() {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
            lock.unlock();
        }
    }
}
