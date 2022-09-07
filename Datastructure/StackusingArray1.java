package Datastructure;


class Stack{
    int tos=-1;
    int s[]=new int[10];
    Stack(){
        tos=-1;
    }
    void push(int n){
        if(tos==9){
            System.out.println("Stack is full");}
        else{
         s[++tos]=n;
    }
    }
     int pop(){
        if(tos>=0)
        return s[tos--];
        else{
        System.out.println("stack is empty");
        return -1;
    }
   
}
}
public class StackusingArray1 {
    

public static void main(String[] args) {
    Stack s1=new Stack();
    s1.push(10);
    s1.push(20);
    s1.push(30);
    System.out.println(s1.pop());
    System.out.println(s1.pop());
    
}    
}
