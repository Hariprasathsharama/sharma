package oops.Linkedlists;

public class LinklistHeadandTail_Main {
    public static void main(String[] args) {
        LinklistHeadandTail list=new LinklistHeadandTail();
        list.insertLast(50);
        list.insertItem(20);
        list.insertItem(10);
        list.insertItem(40);
        list.insertatPos(30, 3);
        list.insertatPos(5, 0);
        
        list.display();
        System.out.println("After deletion");
        list.deletefirst();
        
        list.display();
        System.out.println("Delete last");
        list.deletelast();
        list.display();
    }
}
