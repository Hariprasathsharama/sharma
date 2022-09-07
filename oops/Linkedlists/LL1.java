package oops.Linkedlists;

/**
 * LL1
 */
class Node{
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        next=null;
    }
}
public class LL1 {
    Node head;


    public LL1() {
        head=null;
    }
    public void insert(int val){
        Node newnode=new Node(val);
        if(head==null){
            head=newnode;
        }
        else{
            newnode.next=head;
            head=newnode;
        }
    }
    public void display(){
     Node temp=head;
     while (temp!=null) {
        System.out.println(temp.data);
        temp=temp.next;
     }   
    }
    // public void insertatpos(int val,int pos){
    //     Node newnode=new Node(val);
    //     Node temp=head;
    //     for (int i = 1; i < pos; i++) {
    //         temp=temp.next;
    //     }
 
    // }
}