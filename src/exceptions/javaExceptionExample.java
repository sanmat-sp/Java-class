package exceptions;

public class javaExceptionExample {
    public static void main(String[] args) {
        try{
            int data=100/0;
        }
        catch (ArithmeticException e){
            System.out.println("Can't divide by zero");
            System.out.println(e);
        }
        System.out.println("rest of the code...");
    }
}
