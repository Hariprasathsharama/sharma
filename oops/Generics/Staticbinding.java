package oops.Generics;


class Outer{
    int no;
    String name;
   public void Print(){
        System.out.println("Hi im parent class");

    }
}


public class Staticbinding extends Outer {
    public void Print(){
        System.out.println("Hi im base class");
    }
    public static void main(String[] args) {
        
        Outer obj=new Staticbinding();
        obj.Print();
        Outer u1=new Outer();
        u1.Print();
        
    }
}

