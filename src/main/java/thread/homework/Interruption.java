package thread.homework;

/**
 * author Igor
 */
public class Interruption {

    public static void main(String[] args) throws InterruptedException {

        MyAwesomeThread myAwesomeThread = new MyAwesomeThread();
        myAwesomeThread.start();
        Thread.sleep(5000);
        myAwesomeThread.interrupt();
    }

    private static class MyAwesomeThread extends Thread {

        @Override
        public void run() {
            int i = 0;
            while (true) {
                System.out.println(i++);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    System.out.println("InterruptedException");
                    printSomething();
                    return;
                }
            }
        }

        private void printSomething() {
            String something = "Something";
            System.out.println(something);
            printSomething(something);
        }

        private void printSomething(String something) {
            System.out.println(something);
        }
    }
}
