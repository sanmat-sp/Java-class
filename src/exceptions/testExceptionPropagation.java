package exceptions;
import java.io.IOException;

class testExceptionPropagation {
    void m() throws IOException{
        int c=10+20;
        someOtherMethod();
        throw new java.io.IOException("Device error");
    }

    private void someOtherMethod(){
        int j=20+30;
        for(int i=0;i<3;i++){
            int k=i*j;
            System.out.println(i+" x "+j+" = "+k);
        }
    }

    void n() throws IOException{
        m();
    }

    void p(){
        try{
            n();
        }catch (Exception e){
            System.out.println("Exception handeled");
        }
    }

    public static void main(String[] args) {
        testExceptionPropagation obj=new testExceptionPropagation();
        obj.p();
        System.out.println("Normal flow");
    }
}
