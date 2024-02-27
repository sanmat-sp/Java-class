package Threads;

public class myThread extends Thread{
    int multiplicant;
    public myThread(String dbThread, int i){
        super(dbThread);
        multiplicant=i;
    }

    @Override
    public void run(){
        for (int i=0;i<5;i++) {
            try {
                Thread.sleep(500);
                System.out.println(Thread.currentThread().getName() + " - " + (i * multiplicant));
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
