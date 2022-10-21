package Collections;

import java.util.Stack;

/**
 * Stack
 */
public class Stacksample {

    public static void main(String[] args) {
    Stack<Integer> stack=new Stack<>();
    stack.add(10);
    stack.add(10);
    stack.add(10);
    stack.add(10);
    Stack<Integer> stack2=new Stack<>();
    stack2.add(20);
    stack2.add(20);
    stack2.add(20);
    stack2.add(20);
    
    System.out.println(stack);
    System.out.println(stack.capacity());
    System.out.println(stack.clone());
    System.out.println(stack2.containsAll(stack2));
    System.out.println(stack.peek());
    System.out.println(stack.pop());
    System.out.println(stack.size());
    System.out.println(stack.equals(stack2));
    System.out.println(stack.removeElement(10));
    System.out.println(stack.size());
    System.out.println(stack.get(1));
    System.out.println(stack.hashCode());
    
    
}
    
}