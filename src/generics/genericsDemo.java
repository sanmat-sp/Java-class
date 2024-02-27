package generics;

import java.util.ArrayList;
import java.util.List;
public class genericsDemo {
    public static void main(String[] args) {
        List l=new ArrayList();
        l.add("abc");
        l.add(5);

        for(Object o:l){
            String s=(String) o;
        }

        List<String> l1=new ArrayList<String>();
        l1.add("abc");
//        l1.add(5);

        for(String s:l1){

        }
    }
}
