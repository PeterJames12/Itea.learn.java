package thread.homework2;

/**
 * author Igor
 */
public class Producer {

    private final SecondConsumer consumer;

    public Producer(SecondConsumer consumer) {

        this.consumer = consumer;
    }

    public void producerTask() {
        consumer.setTask(() -> System.out.println("producer task executed"));
    }
}
