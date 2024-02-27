package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService e=Executors.newFixedThreadPool(5);
        for(int i=0;i<=10;i++){
            Runnable coolie=new coolieThread(""+i);
            e.execute(coolie);
        }
        e.shutdown();

        while (!e.isTerminated()){}
        System.out.println("Finished all threads");
    }
}
