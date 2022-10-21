package oops.Generics;

/**
 * LinkedliMain
 */
public class LinkedliMain {

    public static void main(String[] args) {
        Linkedlist<Integer> list=new Linkedlist<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.add(50);
        list.add(60);
        list.display();
        System.out.println(list.contains(50));
        
        
    }
}