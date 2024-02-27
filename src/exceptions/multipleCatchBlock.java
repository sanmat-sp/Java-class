package exceptions;

import java.sql.SQLOutput;

public class multipleCatchBlock {
    public static void main(String[] args) {
        try{
            int a[]=new int[10];
            a[10]=30/2;
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception occurs");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of range exception occurs");
        }catch (Exception e){
            System.out.println("Parent exception occurs");
        }
        System.out.println("rest of the code...");

    }
}
