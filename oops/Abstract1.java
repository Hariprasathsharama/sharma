package oops;
abstract class Color{
    Color(){
        System.out.println("It is inside color");
    }
    abstract void colour();
}
class Red extends Color{
    void colour(){
        System.out.println("It is red");
    }
}
class White extends Color{ 
    void colour(){
        System.out.println("It is white");
    }
}



public class Abstract1 {
    
    public static void main(String[] args) {
        Color obj=new White();
        obj.colour();
        Color obj2=new Red();
        obj2.colour();
        
    }
    
}
