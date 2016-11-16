package thread.homework2;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * author Igor
 */
public class SecondConsumer implements Runnable{

    Runnable task;

    ReadWriteLock lock = new ReentrantReadWriteLock();

    @Override
    public synchronized void run() {

        while (true) {
            System.out.println("Waiting...");
            lock.readLock().lock();
            if (task == null) {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                task.run();
                task = null;
            }
            lock.readLock().unlock();
        }
    }

    public void setTask(Runnable task) {
        lock.writeLock().lock();
        this.task = task;
        try {
            System.out.println("Setting the value");
            Thread.sleep(5_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lock.writeLock().unlock();
    }
}
