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

    int size=0;
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
        size++;
    }
    public void display(){
     Node temp=head;
     while (temp!=null) {
        System.out.println(temp.data);
        temp=temp.next;
     }   
    }
    public void insertatpos(int val,int pos){
        if(pos==0){
            insert(val);
            return;
        }
        if(pos>size){
            throw new IllegalArgumentException("Invalid pos" + pos);        }
        Node newnode=new Node(val);
        Node temp=head;
        for (int i = 1; i < pos; i++) {
            temp=temp.next;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }
}