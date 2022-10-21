package oops.Linkedlists;

public class Doublylinkedlist {
    Node head;
    class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data) {
            this.data = data;
        }
        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
        public Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
        
    }
    public void insert(int val){
        Node node=new Node(val);
        if(head==null){
            head=node;
        }        
        else{
            node.next=head;
            head.prev=node;
            head=node;
            
        }

    }
    public void display(){
        Node temp=head;
        while (temp!=null) {
            System.out.println(temp.data);
            temp=temp.next;
        }

    }
    public void displayreverse(){

        Node temp=head;
        Node last=null;
        while (temp!=null) {
            last=temp;
            temp=temp.next;
        }
        
        while (last!=null) {
            System.out.println(last.data);
            last=last.prev;
        }
    }
    
}
