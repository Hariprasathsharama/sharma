package oops.Linkedlists;


class Node{
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        next=null;
    }
    
}
public class Linkedlist{
    Node head;

    public Linkedlist() {
        head=null;
    }
    public void insert(int val){
        Node newnode=new Node(val);
        if(head==null){
            newnode=head;
        }
        else{
            newnode.next=head;
            newnode=head;
        }
    }
    
}
