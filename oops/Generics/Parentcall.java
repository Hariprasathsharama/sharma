package oops.Generics;

public class Parentcall {
    void prints(){
        System.out.println("Im in parent class");
    }
  
}
class Base extends Parentcall{
    void println(){
        System.out.println("Im in base class");
    }

}

class Mains{
public static void main(String[] args) {
   
    Parentcall obj=new Base();
    obj.prints();
}
}