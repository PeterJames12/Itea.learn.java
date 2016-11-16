package thread.beforeLesson;

import lombok.val;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class Synchron {

    private static List<Integer> list = new LinkedList<>();

    private static Object o = new Object();

    public static void main(String[] args) {

        IntStream.rangeClosed(1, 12).forEach(list::add);

        final MyAwesomeSomething obj = new MyAwesomeSomething();
        new Thread(obj::printNumbers).start();
        new Thread(obj::printNumbers).start();

        final Thread thread = Thread.currentThread();

        System.out.println(thread);

//        for (int i = 1; i < 12; i++) {
//            new Thread(Awesome::linux).start();
//            System.out.println(Thread.currentThread().getState());
//        }
    }

    private static class MyAwesomeSomething {
        private void printNumbers() {
            synchronized (this) {
                for (int i = 0; i < 11; i++) {
                    System.out.println(Thread.currentThread().getName() + " " + i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            for (int i = 20; i < 30; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static class Awesome {

        static synchronized void linux() {
            System.out.println(Thread.currentThread().getState());
            for (Integer aList : list) {
                System.out.println(Thread.currentThread().getName() + " " + aList);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}