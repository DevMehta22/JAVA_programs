public class Thread_creation {
    public static void main(String[] args) {
        for (int i = 501; i <= 700; i++) {
            System.out.println("Hello from Thread-" + i);
        }
        
        child_thread1 CT1= new child_thread1();
        CT1.start();

        Thread CT2 = new Thread(new child_thread2());
        CT2.start();
    }
}
class child_thread1 extends Thread{
    public void run(){
        for(int i=1;i<=250;i++){
            System.out.println("hello from child thread 1:"+i);
        }
    }
}

class child_thread2 implements Runnable{
    public void run(){
        for(int i=250;i<=500;i++){
            System.out.println("hello from child thread 2:"+i);
        }
    }
}


