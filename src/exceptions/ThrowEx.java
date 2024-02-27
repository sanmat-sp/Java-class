package exceptions;
import java.io.FileNotFoundException;

public class ThrowEx {
    public static void validate(int age) throws UserDefinedException {
        if(age<18){
            throw new ArithmeticException(("Your age should be 18 to vote"));
//            throw new UserDefinedException("User defined exception : Minimum voting age is 18");
        }
        else{
            System.out.println("You can vote");
        }
    }

    public static void main(String[] args) {
        try{
            validate(13);
        }catch (UserDefinedException e){
            throw new RuntimeException(e);
        }
    }
}
