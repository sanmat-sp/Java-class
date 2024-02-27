package Threads;
import java.util.*;

public class ThreadJoin extends Thread{
    public void run(){
        for(int j=0;j<3;j++){
            try{
                Thread.sleep(300);
                System.out.println("The current thread name is "+Thread.currentThread().getName());
            }catch (Exception e){
                System.out.println("The exception has been caught "+e);
            }
            System.out.println(j);
        }
    }
}
