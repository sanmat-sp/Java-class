package exceptions;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CheckExceptionEx {
    public static void main(String[] args) {
        PrintWriter pw;
        try{
            pw=new PrintWriter("jtp.txt");
        }catch(FileNotFoundException e){
            throw new RuntimeException((e));
        }
        pw.println("Saved");
    }
}
