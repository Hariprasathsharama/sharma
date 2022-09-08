package oops.Linkedlists;

public class LinklistHeadandTail {
    Node head,tail;
    int size;
    class Node{
        int data;
        Node next;
        
        public Node(int data) {
            this.data = data;
        }

         public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

    }
    public void insertItem(int val){
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
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }

    }
    public void insertLast(int val){
        Node newnode=new Node(val);
        if(tail==null){
            insertItem(val);
        }
        else{
            newnode.next=tail;
            tail=newnode;
        }
    }
    public void insertatPos(int val,int pos){

        Node newnode=new Node(val);
        Node temp=head;
        if(pos==0){
            insertItem(val);
            return;
        }
        if(pos==size){
            insertLast(val);
            return;
        }
        if(pos>size){
            throw new IndexOutOfBoundsException("List out of range");
        }
        else{
            for (int i = 1; i < pos; i++) {
                temp=temp.next;
            }
            newnode.next=temp.next;
            temp.next=newnode;
        }

    }
    public void  deletefirst(){
        if(head==null){
            tail=null;
            throw new ArrayIndexOutOfBoundsException("No values");
        }
        head=head.next;
        size--;
    }
    public void deletelast(){
        tail=head;
        for (int i = 1; i < size; i++) {
            tail=tail.next;
        }
        tail.next=null;
        size--;
    }
    public void  Deleteatpos(int pos){
        if(head==null){
            throw new IndexOutOfBoundsException("List is empty");
        }
        Node temp=head;
        Node prev=null;
        for (int i = 1; i < pos; i++) {
            prev=temp;
            temp=temp.next;
        }
        prev.next=temp.next;

    }

}
