package Aboutarrays;

public class Fatherchild {
    public static void main(String[] args) {
        String[][] fc={{"luke","shaw"},
                    {"wayne","rooney"},
                    {"rooney","ronaldo"},
                    {"shaw","rooney"}
    };
    String father="rooney";
    String children="";
    int childrencount=0;
    int grandchildrencount=0;
    
    for (int i = 0; i < fc.length; i++) {
        for (int j = 0; j < fc[i].length; j++) {
           if(father.equals(fc[i][1])){
                children=fc[i][0];
                childrencount++;
                break;
                
           } 

        }
    
        for (int j = 0; j < fc.length; j++) {
            if(children.equals(fc[i][1])){
               
                grandchildrencount++;  
            }
        }
    }
    System.out.println("children="+children+"-"+childrencount);
    System.out.println("grandchildren="+""+grandchildrencount);
    }
}
