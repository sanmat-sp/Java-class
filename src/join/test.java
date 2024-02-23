package join;

public class test extends Thread{
    @Override
    public void run(){
//        System.out.println("Thread is running");
        for (int i=1;i<5;i++){
            System.out.println(Thread.currentThread().getName()+" "+ i);
        }
    }

    public static void main(String args[]) throws InterruptedException {
        test t1=new test();
        test t2=new test();
        test t3=new test();

//        t1.run();
        t1.start();
//        t1.join();
        t2.run();
//        t2.join();
        t3.start();
    }
}


