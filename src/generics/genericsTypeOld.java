package generics;

public class genericsTypeOld {
    private Object t;

    public Object get(){
        return t;
    }

    public void set(Object t){
        this.t=t;
    }

    public static void main(String[] args) {
        genericsTypeOld type=new genericsTypeOld();
        type.set("Sanmat");
        String s=(String) type.get(); //type casting, error-prone and can cause ClassCastException
    }
}
