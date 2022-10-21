package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;


public class Listinteger <E> {
  public static void main(String[] args) {
    List<Integer> a=new ArrayList<>();
    a.add(40);
    a.add(10);
    a.add(20);
    a.add(30);
    Object[] b=a.toArray();//convert collection into object .In object we cannot handle operate arithmetic operation.
     for(int i=0;i<b.length;i++){

      System.out.println(b[i]);
     }
      System.out.println(Arrays.toString(b));


     List<Integer> c=new ArrayList<>();
     c.add(40);
     c.add(20);
     Integer k[]=new Integer[c.size()];//By using Integer wrapper class we able handle arithmetic operation 
     Integer d[]=c.toArray(k);
     for (int i = 0; i < d.length; i++) {
         d[i]+=5;
        System.out.print(d[i]+" ");
     }
     c.add(2,3);
     System.out.println("append"+c);


     List<String> u=new ArrayList<>();
     u.add("hari");
     u.add("prasath");
     u.add("harish");
     u.add("harini");
     u.add("haririshi");
     List<String> l=new ArrayList<>();
     l.add("hari");
     l.add("harish");
     l.add("harini");
     u.retainAll(l);//    Retain  the common element
     System.out.println(l);
     System.out.println(u);
     System.out.println("Before retain");

     HashSet<String> h=new HashSet<>();
     h.add("one");
     h.add("two");
     h.add("three");
     h.add("four");
    

     List<String> linkedlist=new LinkedList<>();
     linkedlist.add("one");
     linkedlist.add("two");
     linkedlist.add("five");
     linkedlist.add("six");
    
     System.out.println("Before retain");
     System.out.println(h);
     System.out.println(linkedlist);
     System.out.println("After retain");
     linkedlist.retainAll(h);
     System.out.println(h);
     System.out.println(linkedlist);   
     
    
   System.out.println(l.get(2));

   a.addAll(c);
   System.out.println(a);
  boolean n=Collections.addAll(c, 1,2,4,5,6);
  System.out.println(n);
  System.out.println(c);


  System.out.println( a.containsAll(c));


  
  List<Integer> h1=Arrays.asList(new Integer[]{1,2,3,4});//as lit function used to convert array to list   
  System.out.println(h1);

  System.out.println(  h1.contains(2));
 
  Arrays.stream(d).forEach(System.out::println);
     h1.forEach(System.out::print);


     System.out.println(List.copyOf(a));//list also have some methods...
     List<String> col=List.of(
            "hey","hi"
   );
   System.out.println(col);
}
   
   
}



 