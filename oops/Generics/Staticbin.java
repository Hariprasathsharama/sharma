package oops.Generics;


class Staticbin {
 
       static  void fun(){
            System.out.println("im inside parent");
        }
         void show(){
            System.out.println("Im in parent class");
        }
    
}
    class Inner extends Staticbin{
      static  void fun(){
            System.out.println("Im in inside base");
        }
         void show(){
            System.out.println("Im in base class");
        }
    }
    class Main{
    public static void main(String[] args) {
    //  Outer obj=new Inner();
    //  Outer obj2=new Outer();
    //  obj2.fun();
    //  obj.fun();
    Staticbin obj=new Inner();
    obj.fun();
    obj.show();

    }

    }