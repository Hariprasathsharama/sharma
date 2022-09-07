package Datastructure;


class Queue{
    int a[]=new int[10];
    int front,rear;
  Queue(){
   
    front=-1;
    rear=-1;

  }
  void enque(int n){
    if(rear==9)
    System.out.println("queue is full");
    else
    if(front==-1)
    front++;
    a[++rear]=n;
  }
  int dequeue(){
    if(front==-1 || front>rear)
     throw new IndexOutOfBoundsException("queue is empty");
    else
    return a[front++];
  }
}
public class Queueusingarray {

    public static void main(String[] args) {
        Queue q= new Queue();
        q.enque(10);
        q.enque(20);
        q.enque(30);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        
        
    }
}
