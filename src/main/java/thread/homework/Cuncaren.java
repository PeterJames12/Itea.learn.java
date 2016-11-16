package thread.homework;

import java.util.stream.IntStream;

/**
 * author Igor
 */
public class Cuncaren {

    public static void main(String[] args) {

        new MyAwesomeThread().start();
        new Thread(new MyAwesomeRunnable(), "Runnable: ").start();

    }

    private static class MyAwesomeThread extends Thread {

        {
            setName("thread: ");
        }

        @Override
        public void run() {
            printNumbers();
        }
    }

    private static class MyAwesomeRunnable implements Runnable {

        @Override
        public void run() {
            printNumbers();
        }
    }

    private static void printNumbers() {
        IntStream.rangeClosed(1, 12).forEach(s -> System.out.println(Thread.currentThread().getName() + s));
    }
}
