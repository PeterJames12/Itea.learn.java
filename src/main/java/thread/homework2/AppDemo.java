package thread.homework2;
// 0965002039
/**
 * author Igor
 */
public class AppDemo {

    public static void main(String[] args) throws InterruptedException {

       SecondConsumer consumer = new SecondConsumer();
        new Thread(consumer).start();
        Producer producer = new Producer(consumer);
        Thread.sleep(2_000);
        producer.producerTask();
    }
}
