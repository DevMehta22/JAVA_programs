public class Thread_creation3 {
    private static final int LIMIT = 20;
    private static final Object lock = new Object();
    private static int counter = 1;

    public static void main(String[] args) {
        Thread evenThread = new Thread(new EvenRunnable());
        Thread oddThread = new Thread(new OddRunnable());

        evenThread.start();
        oddThread.start();
    }

    static class EvenRunnable implements Runnable {
        @Override
        public void run() {
            while (counter <= LIMIT) {
                synchronized (lock) {
                    if (counter % 2 == 0) {
                        System.out.println("Even: " + counter);
                        counter++;
                        lock.notify();
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
            }
        }
    }

    static class OddRunnable implements Runnable {
        @Override
        public void run() {
            while (counter <= LIMIT) {
                synchronized (lock) {
                    if (counter % 2 != 0) {
                        System.out.println("Odd: " + counter);
                        counter++;
                        lock.notify();
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
            }
        }
    }
}
