package oops.Generics;

public class Linkedlist<T> {
    Node head;

    class Node{
        T data;
        Node next;

        
        public Node(T data) {
            this.data = data;
           
        }

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
           
        }
        
    }
    public void add(T val) {
        Node node=new Node(val);
        if(head==null){
            head=node;
        }
        else{
            node.next=head;
            head=node;
        }
        
    }
    public void insertpos(T val,int pos){
        Node node=new Node(val);
        Node temp=head;
        for (int i = 1; i < pos; i++) {
            temp=temp.next;
        }
        node.next=temp.next;
        temp.next=node;
    }
    public void delete(){
        if(head==null){
          throw new ArrayIndexOutOfBoundsException("No element in list");
            
        }
        else{
            head=head.next;
            

        }

    }
    public  boolean contains(T val){
        Node temp=head;
        while(temp!=null){
            if(temp.data==val){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
   public void display(){
    Node temp=head;
    while(temp!=null){
        System.out.println(temp.data);
        temp=temp.next;
    }
   }
}
