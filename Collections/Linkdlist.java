package Collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class Linkdlist {

    /**
     * InnerLinkdlist
     * 
     */
   int no;
   String name;

    public Linkdlist(int no, String name) {
    this.no = no;
    this.name = name;
}

    public static void main(String[] args) {
        LinkedList<Integer>list=new LinkedList<>();
        list.add(10);
        list.add(null);
        list.add(null);
        
        System.out.println(list.get(2));
        LinkedList<Linkdlist> ll=new LinkedList<>();
        ll.add(new Linkdlist(1, "hari"));
        ll.add(new Linkdlist(1, "hari"));
        ll.add(new Linkdlist(1, "hari"));
        ll.add(new Linkdlist(1, "hari"));
        ll.add(new Linkdlist(1, "hari"));
        ListIterator<Linkdlist> lt=ll.listIterator();
        while (lt.hasNext()) {
            System.out.println(lt.next().name);
        }

       LinkedList<Employee>e1=new LinkedList<>();
    //    e1.add(new Employee(1, "sharma"));
    //    e1.add(new Employee(1, "sharma"));
    //    e1.add(new Employee(1, "sharma"));
    //    e1.add(new Employee(1, "sharma"));
    //    e1.add(new Employee(1, "sharma"));
    Employee emp=new Employee(1, "sharma");
        e1.add(emp);
       ListIterator<Employee>i=e1.listIterator();
        while (i.hasNext()) {
            System.out.println(i.next().no);
        }
    

    }

}