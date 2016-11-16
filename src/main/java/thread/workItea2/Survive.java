package thread.workItea2;

import java.util.concurrent.Callable;

/**
 * author Igor
 */
public class Survive {

    private static final Shema shema = new Shema();


    public static void main(String[] args) throws Exception {

//        System.out.println(shema.getState());
        /*shema.start();
        System.out.println(shema.getState());
        Thread.sleep(1000);
        System.out.println(shema.getState());
        shema.join();
        System.out.println(shema.getState());

        */
/*

        Thread thread = new Thread(Survive::runFirst);
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
        Thread.sleep(1_000);
        System.out.println(thread.getState());
*/

        Callable<Integer> callable = () -> 2;
        System.out.println(callable.call());

    }

    private static void run() {

        for (int i = 0; i < 100; i++) {
            i++;
        }
    }

    private static class Shema extends Thread {

        @Override
        public void run() {
            for (int i = 1; i < 12; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static class Colab implements Callable<Integer> {

        int i = 5;

        @Override
        public Integer call() throws Exception {
            return i + 5 + 2;
        }
    }
}
