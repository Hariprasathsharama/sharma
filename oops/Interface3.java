package oops;

public class Interface3 implements Interface1,Interaface2 {
    @Override
    public void start(){
        System.out.println("im in start interface 3");
    }
    @Override
    public void stop(){
        System.out.println("Im in stop interface 3");
    }
    @Override
    public void breake(){
        System.out.println("im in breake interface 3");
    }



 
}

