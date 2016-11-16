package thread.beforeLesson;

import lombok.SneakyThrows;
import lombok.val;

/**
 * author Igor
 */
public class Multi {

    @SneakyThrows
    public static void main(String[] args) {

        System.out.println(Thread.activeCount());

        String mas[] = {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#",};

        new Thread(new Groooy(), "dsdd").start();

        for (String ma : mas) {
            Thread.sleep(300);
            System.out.print("mas: " + ma);
        }

        new Thread(() -> System.out.println("Hello")).start();
    }

    private static final class Groooy implements Runnable {

        String[] arr = {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#"};

        @Override
        @SneakyThrows
        public void run() {
            for (String anArr : arr) {
                Thread.sleep(300);
                System.out.print("arr: " + anArr);
            }
        }
    }
}
