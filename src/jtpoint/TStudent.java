package jtpoint;

public class TStudent {
    int rn;
    String name;
    float fee;

    public TStudent(int rn, String name, float fee){
        this.rn=rn;
        this.name=name;
        this.fee=fee;
    }

    public void display() {
        System.out.println(rn + ", " + name + ", " + fee);
    }
}

class test{
    public static void main(String[] args) {
        TStudent t=new TStudent(28,"Sanmat",2803f);
        t.display();
    }
}
