package oops.Linkedlists;

class Node{
    int data;
    Node next;
    Node(int n){
        data=n;
        next=null;
    }
}
public class Linkedlist {
    Node head;


     public Linkedlist() {
        head=null;
    }
    public void insertitem(int val){
        Node N=new Node(val);
        if(head==null){
            head=N;
        }
        else{

            N.next=head;
            head=N;                    
        }
    }
    public void getitem(){
        Node temp=head;
        while (temp!=null) {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    

}
