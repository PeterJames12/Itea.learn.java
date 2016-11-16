package thread.homework;

/**
 * author Igor
 */
public class Gradl {

    public static void main(String[] args) throws InterruptedException {

        Printer printer = new Printer();

        new Thread(printer::printNumbers).start();

    }

    private static class Printer extends Thread {

        private void printNumbers() {

            synchronized (this) {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

            for (int i = 200; i < 210; i++) {
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
