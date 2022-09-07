package oops.Generics;

public class GenericsMain {
    public static void main(String[] args) {
        Genericsdemo<String> gd=new Genericsdemo<String>("hello");
        gd.display();
        Genericsdemo<Integer> Igd=new Genericsdemo<Integer>(1234);
        Igd.display();
    }
}
