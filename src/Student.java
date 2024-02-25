public class Student {
    public static String COLLAGE_NAME = "PES";
    String name;
    int age;
    boolean isEligible;

    public Student(String name, int age, boolean isEligible){
        this.name = name;
        this.age = age;
        this.isEligible = isEligible;
    }

    public Student(String name){
        this.name = name;
    }

    public void display(){
        System.out.println(this.name);
    }
}
