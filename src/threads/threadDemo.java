package threads;

public class threadDemo {
    public static void main(String args[]){
        thread1 t1= new thread1();
        t1.start();
        for (int i=1;i<5;i++) {
            try {
                Thread.sleep(750);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println((i * 10));
        }
    }
}
