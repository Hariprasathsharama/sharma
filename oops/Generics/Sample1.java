package oops.Generics;

import java.util.ArrayList;

/**
 * Sample1
 */
public class Sample1 {

    public static void main(String[] args) {
     
        ArrayList<String> str=new ArrayList<String>();
        str.add("hello");
        str.add("hi");
        ArrayList <Integer> a = new ArrayList<Integer>();
        a.add(20);
        a.add(10);
        a.add(40);
        Sample1 s=new Sample1();
        // s.Prints(str);
        s.Prints(a);    

    }
      void  Prints(ArrayList<? extends Number> str){
        System.out.println(str);
    }
}