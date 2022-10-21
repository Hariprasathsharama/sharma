package Datastructure.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Mapmethodss
 */
public class Mapmethodss {

    public static void main(String[] args) {
        Map<Integer,String> m=new HashMap<>();
        m.put(1, "Hari");
        m.put(2, "kumar");
        m.put(3, "raj");
        m.put(4, "sekar");
        m.put(5, "ali");
        m.put(6, "kannan");
        m.put(7, "khan");
        System.out.println(m);
        System.out.println(m.get(5));
        System.out.println(m.size());
        for (int i = 1; i <= m.size(); i++) {
            System.out.print(m.get(i)+" ");
        }
        System.out.println(m.keySet());
        System.out.println(m.containsKey(9));
        System.out.println(m.containsValue("kannan"));
        System.out.println(m.containsValue("all"));
        
    }
}