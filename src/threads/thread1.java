package threads;

public class thread1 extends Thread{
    @Override
    public void run(){
//        System.out.println("Thread is running");
        for (int i=1;i<5;i++){
            try{
                Thread.sleep(500);
                System.out.println(i);
            }catch(InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
