import java.util.LinkedList;

class SharedBuffer {
    private LinkedList<Integer> buffer = new LinkedList<>();
    private int capacity;

    public SharedBuffer(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void produce(int item) {
        while (buffer.size() == capacity) {
            try {
                wait(); // Wait if the buffer is full
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        buffer.add(item);
        System.out.println("Produced: " + item);
        notifyAll(); // Notify consumer that an item is available
    }

    public synchronized int consume() {
        while (buffer.isEmpty()) {
            try {
                wait(); // Wait if the buffer is empty
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int item = buffer.removeFirst();
        System.out.println("Consumed: " + item);
        notifyAll(); // Notify producer that space is available
        return item;
    }
}

class Producer extends Thread {
    private SharedBuffer buffer;

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            buffer.produce(i);
            try {
                Thread.sleep(100); // Simulate time to produce an item
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    private SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            int item = buffer.consume();
            try {
                Thread.sleep(100); // Simulate time to consume an item
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class producer_consumer {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer(5); // Buffer with a capacity of 5

        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }
}
