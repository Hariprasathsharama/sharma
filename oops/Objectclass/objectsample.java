package oops.Objectclass;

/**
 * objectsample
 */
public class objectsample {
    private int a;
    private String s="";
    
    public objectsample() {
    
    }
    

    public objectsample(int a, String s) {
        this.a = a;
        this.s = s;
    }

      public String toString(){
         return s+" "+a;
     }
     public int hashCode(){
        return a;
     }
    
    public static void main(String[] args) {
        objectsample obj=new objectsample(1,"hari");
        objectsample obj2=new objectsample(1,"hari");
        objectsample obj3=obj2;
        objectsample o1=(objectsample)(obj2);
        System.out.println(o1);
        System.out.println(obj.equals(obj2));
        System.out.println(obj.toString());

        System.out.println(obj.hashCode());
        System.out.println(obj2.equals(obj3));
        
    }
  
}