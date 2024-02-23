package exception;

import java.io.FileNotFoundException;

public class exception1 {
    public static void validate(int age) throws UserDefinedException {
        if(age<18){
//            throw new ArithmeticException("Your age should be 18 to vote.");
            throw new UserDefinedException("User Defined Exception");
        }
        else{
            System.out.println("You can vote.");
        }
    }

    public static void main(String args[]) throws UserDefinedException {
        validate(17);
//        try {
//            validate(12);
//        }
//        catch(Exception e){
//            System.out.println("Call received");
//        }
    }
}
