package threads;

public class ThreadsDemo {
    public static void main(String args[]){
        RThread rt=new RThread();
        Thread t=new Thread(rt);
        t.start();
    }
}
