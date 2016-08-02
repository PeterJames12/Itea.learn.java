package thread.homework;

/**
 * author Igor
 */
public class Counter {

    private static final SynchronizeCounter synchronizeCounter = new SynchronizeCounter();


    public static void main(String[] args) throws InterruptedException {

        new IncrementThread().start();
        Thread.sleep(50);
        new DecrementThread().start();
        Thread.sleep(1000);
        System.out.println("Value: " + synchronizeCounter.value());
    }

    private static class IncrementThread extends Thread {

        @Override
        public void run() {
            System.out.println("Thread B before increment: ");
            synchronizeCounter.increment();
            System.out.println("Thread B after increment: ");
        }
    }


    private static class DecrementThread extends Thread {

        @Override
        public void run() {
            System.out.println("Thread A before decrement: ");
            synchronizeCounter.decrement();
            System.out.println("Thread A before decrement: ");
        }
    }


    private static class SynchronizeCounter {

        private int counter;

        private synchronized void increment() {
            System.out.println("Increment begin executed");
            counter++;
            try {
                Thread.sleep(Integer.MAX_VALUE);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        private synchronized void decrement() {
            System.out.println("Decrement begin executed");
            counter--;
        }
        private int value() {
            return counter;
        }
    }
}
