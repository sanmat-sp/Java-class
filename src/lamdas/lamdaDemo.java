package lamdas;

import java.util.function.Function;
import java.util.function.Predicate;

public class lamdaDemo {
    public static int someMethod(String str) {
        System.out.println("Hi "+str);
                return 28;
    }

    public static void main(String[] args) {
        SayableImpl sayable=new SayableImpl();
        sayable.say();

        Sayable s1=()->{
            System.out.println("You are saying something");
        };
        s1.say();

        Printable pr= (pmsg) ->{
            System.out.println("The message is "+pmsg);
        };
        pr.printMsg("My message");

        Predicate<Integer> pr1=(tInt)->(tInt>18);
        System.out.println(pr1.test(19));

        Function<String,Integer> solution=(name)->{
            System.out.println("How are you "+name+"?");
            return 20;
        };
        int val=solution.apply("Sanmat");
        System.out.println("The value is "+val);

        Function<String,Integer> sal=lamdaDemo::someMethod;
        int val1=sal.apply("Sanmat");
        System.out.println("The value at the end is "+val1);
    }
}
