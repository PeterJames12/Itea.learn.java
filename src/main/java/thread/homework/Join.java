package thread.homework;

/**
 * author Igor
 */
public class Join {

    public static void main(String[] args) throws InterruptedException {

        MyAwesomeJoin myAwesomeJoin = new MyAwesomeJoin(MyAwesomeJoin.class.getSimpleName());
        System.out.println("Waiting for thread " + myAwesomeJoin.getName());
        myAwesomeJoin.start();
        myAwesomeJoin.join();
        System.out.println("thread " + myAwesomeJoin.getName() + " executed");
    }

    private static class MyAwesomeJoin extends Thread {

        public MyAwesomeJoin(String name) {
            super(name);
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(i++);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
