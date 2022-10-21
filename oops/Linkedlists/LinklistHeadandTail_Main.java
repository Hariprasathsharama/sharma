package oops.Linkedlists;

public class LinklistHeadandTail_Main {
    public static void main(String[] args) {
        LinklistHeadandTail list=new LinklistHeadandTail();
        list.insertLast(50);
        list.insertItem(20);
        list.insertItem(10);
        list.insertItem(40);
        // list.insertatPos(30, 3);
        // list.insertatPos(5, 0);
        
        list.display();
        System.out.println("delete first");
        list.deletefirst();
        list.display();
        System.out.println("delelte last");
        list.deletelast();
        list.display();
        System.out.println("Delete at pos");
        list.Deleteatpos(3);
        list.display();
    }
}
