package oops.Linkedlists;

/**
 * DoublylinkedlistMain
 */
public class DoublylinkedlistMain {

    public static void main(String[] args) {
       Doublylinkedlist list=new Doublylinkedlist();
       list.insert(20);
       list.insert(30);
       list.display();     
       System.out.println("display reverse");
       list.displayreverse();     
    }
}