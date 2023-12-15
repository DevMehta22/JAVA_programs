public class Thread_creation2 {
    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 7;

        child_thread ct = new child_thread(n2);
        ct.start();
        try {
            ct.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Multiplication table of n1:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n1 + "x" + i + "=" + n1 * i);
        }
        
        System.out.println("main thread finished");

    }
}

class child_thread extends Thread {
    private int n;

    public child_thread(int n) {
        this.n = n;
    }

    public void run() {
        System.out.println("Multiplication table of n2:(child thread)");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "x" + i + "=" + n * i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("child thread completed");

    }
}
