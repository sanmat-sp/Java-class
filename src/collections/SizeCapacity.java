package collections;

import java.util.*;
public class SizeCapacity {
    public static void main(String[] args) throws Exception{
        ArrayList<Integer> a=new ArrayList<Integer>(10);
        a.add(1);
        a.add(10);
        System.out.println("The size of the array is "+a.size());
    }
}
