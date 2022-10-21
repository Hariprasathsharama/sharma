package Aboutarrays;

import java.util.ArrayList;
import java.util.List;

public class Findgrandchildren {
    public static void main(String[] args) {
        String[][] family={{"luke","shaw"},
        {"wayne","rooney"},
        {"rooney","ronaldo"},
        {"shaw","rooney"}
};
String father="ronaldo";
     List<String> children = new ArrayList<>();
    for (String[] strings : family) {
    if (father.equals(strings[1])){
     children.add(strings[0]);
    }
 }
 
}
}