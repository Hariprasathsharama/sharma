package oops.Map;

/**
 * MapEntryset
 */
import java.util.*;
public class MapEntryset {

    public static void main(String[] args) {
        Map<Integer,String>map=new HashMap<Integer,String>();
        map.put(1, "hello");
        map.put(3,"everyone");
        map.put(2,"it's ok");
        System.out.println(map.entrySet());
        System.out.println(map.get(1));
        System.out.println(map.getClass());
    }
}   