package jtpoint;

class MyStudent {
    int rn;
    String name;
    float fee;

    MyStudent(int rn, String name, float fee) {
        this.rn = rn;
        this.name = name;
        this.fee = fee;
    }

    void display() {
        System.out.println(rn + ", " + name + ", " + fee);
    }
}
class testThis{
    public static void main(String[] args) {
        MyStudent s1=new MyStudent(28,"Sanmat",4000f);
        MyStudent s2=new MyStudent(18,"Aniket",5000f);
        s1.display();
        s2.display();
    }
}
