package thread.workItea;

/**
 * author Igor
 */

public class Synchroniz extends Thread {

    private static int counter;

    public static void main(String[] args) {

        new Thread(() -> {
            counterInt();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(counter);
        }).start();


        new Thread(() -> {
            counterDec();
            System.out.println(counter);
        }).start();
    }

    private synchronized static void counterInt() {
        System.out.println(new Synchroniz().getName());
        counter++;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private synchronized static void counterDec() {
        System.out.println(new Synchroniz().getName());
        counter--;
    }
}
