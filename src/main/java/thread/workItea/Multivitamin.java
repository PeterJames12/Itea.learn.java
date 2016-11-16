package thread.workItea;

import lombok.SneakyThrows;
import java.util.stream.IntStream;

import static java.lang.System.err;
import static java.lang.System.out;

/**
 * author Igor
 */
public class Multivitamin {

    public static void main(String[] args) {

        Joy joy = new Joy();
        joy.start();


        Runnable runnable = () -> IntStream.rangeClosed(0, 100)
                .forEach(str -> out.println(Thread.currentThread()
                        .getName() + str));

        new Thread(new Joy()).start();
        new Thread(runnable).start();

        threads();
    }

    @SneakyThrows
    private static void threads() {

        Thread.interrupted();
        Thread.sleep(454);
        Thread thread = new Thread();
        thread.join(4545);
        thread.isInterrupted();

        try {
            interrupt();
        } catch (InterruptedException e) {
            err.println("InterruptedException");
        }

    }

    private static void interrupt() throws InterruptedException {

        throw new InterruptedException();
    }

    private static class Joy extends Thread{

        {
            setName("joy");
        }
        @Override
        public void run() {
            IntStream.rangeClosed(0, 100).forEach(str -> out.println(Thread.currentThread().getName()));
        }
    }
}

