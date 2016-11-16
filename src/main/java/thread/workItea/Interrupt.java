package thread.workItea;

import lombok.SneakyThrows;

/**
 * author Igor
 */
public class Interrupt {

    @SneakyThrows
    public static void main(String[] args) {
  /*      MyAwesome myAwesome = new MyAwesome();
        myAwesome.start();
        Thread.sleep(300);
        myAwesome.interrupt();
*/
        Come come = new Come(Come.class.getSimpleName());
        come.start();
        System.out.println("Waiting for thread " + come.getName());
        come.join();
        System.out.println("Thread " + come.getName() + " executed");
        System.exit(2);
    }

    private static class MyAwesome extends Thread {

        @Override
        public void run() {
            int i = 0;
            while (true) {
                System.out.println(i++);
                if (isInterrupted()) {
                    System.out.println("enough");
                    return;
                }
            }
        }
    }

    private static class Come extends Thread {

        public Come(String simpleName) {
            super(simpleName);
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
