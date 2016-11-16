package thread.homework2;

/**
 * author Igor
 */
public class ConsumerK implements Runnable {

    private Runnable task;

    @Override
    public synchronized void run() {
        while (true) {
            System.out.println("Waiting...");
            try {
                wait();
            } catch (InterruptedException ignore) {
            }

            task.run();
            task = null;
        }
    }

    public synchronized void setTask(Runnable task) {
        this.task = task;
        notifyAll();
    }
}
