package collection2.workItea;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.stream.IntStream;

/**
 * author Igor
 */
public class ComeOn extends Thread {


    public static void main(String[] args) {

        BlockingDeque<Integer> blockingDeque = new LinkedBlockingDeque<>();

        new Thread(new Runnable() {
            @Override
            public void run() {
                IntStream.rangeClosed(0, 12).boxed().forEach(blockingDeque::add);
            }
        }).start();

        blockingDeque.forEach(System.out::println);

        new Thread(new Runnable() {
            @Override
            public void run() {
                blockingDeque.forEach(System.out::println);
            }
        }).start();

/*
        Runnable runnable = () -> {
            blockingDeque.clear();
        };
*/

/*
        Thread t = new Thread(new ComeOn());
        t.start();

        blockingDeque.forEach(System.out::println);
*/


    }

}
