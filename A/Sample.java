package A;

 abstract class Sample {
   abstract void fun();


}
class Innersample extends Sample {

    void fun(){
        System.out.println("hello im the method in innersample");
    }
   
}
 class Innersample_1 extends Sample {
    void fun(){
        System.out.println("Hello im the  method innersample1");
    }
}
class Testabstraction{
public static void main(String[] args) {
    Sample obj=new Innersample_1();  
    obj.fun();   
}
}
