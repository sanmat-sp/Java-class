//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class bank1{
    int getROI(){
        return 0;
    }
}

class SBI extends bank1{
    int getROI(){
        return 7;
    }
}

class ICICI extends bank1{
    int getROI(){
        return 8;
    }
}

class AXIS extends bank1{
    int getROI(){
        return 9;
    }
}

public class Main {
    public static void main(String[] args) {
        SBI s=new SBI();
        ICICI i=new ICICI();
        AXIS a=new AXIS();
        System.out.println("SBI Rate of Interest: "+s.getROI());
        System.out.println("ICICI Rate of Interest: "+i.getROI());
        System.out.println("AXIS Rate of Interest: "+a.getROI());

        }
}