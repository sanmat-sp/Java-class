package Threads;

public class ThreadsDemo {
    public static void main(String[] args) {
        ThreadJoin t1=new ThreadJoin();
        ThreadJoin t2=new ThreadJoin();
        ThreadJoin t3=new ThreadJoin();

        t1.start();
        try{
            t1.join();
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        t2.start();
        try {
            t2.join();
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        t3.start();

        /*
        RThread r=new RThread();
        Thread t= new Thread(r);
        t.start();

        myThread dbT=new myThread("dbThread",10);
        dbT.start();

        myThread netT=new myThread("netThread",100);

        for(int i=0;i<5;i++){
            try{
                Thread.sleep(750);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+" - "+i*1000);
        }
         */
    }
}
