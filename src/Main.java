import jdk.jshell.execution.Util;

import java.sql.SQLOutput;

public class Main {
    public static void main(String args[]){
        Gst g = new Gst();
        int tax = g.calculateTax(1000);
        System.out.println("Tax = "+tax);
        System.out.println("Hello and welcome");

        Student Aniket = new Student("Aniket", 3, true);
        System.out.println("1. Name is "+Aniket.name);

        Student Sanmat = new Student("Sanmat", 28, true);
        System.out.println("2. Name is "+Sanmat.name);

        System.out.println(Student.COLLAGE_NAME);
        int sum = Sanmat.age + Aniket.age;
        System.out.println("Sum of ages is "+sum);
        for(int i=1;i<=5;i++){
            System.out.println("i = "+i);
        }
    }
}
