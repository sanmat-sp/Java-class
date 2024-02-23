public class Student {
    int rollno;
    String name;
    float fee;
    Student(int r, String n, float f){
        this.rollno=r;
        this.name=n;
        this.fee=f;
    }
    void display(){
        System.out.println(rollno+" "+name+" "+fee);
    }
}

class stu extends Student{
    int age;
    stu(int r, String n, float f, int a) {
        super(r, n, f);
        this.age=a;
    }
    void display(){
        System.out.println(rollno+" "+name+" "+fee+" "+age);
    }
}

class Test {
    public static void main(String args[]) {
        Student s1 = new Student(111, "Abhishek", 5000f);
        Student s2 = new stu(112, "Aniket", 6000f, 22);
        s1.display();
        s2.display();
    }
}