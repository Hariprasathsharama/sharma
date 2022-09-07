package pack.packex.packex1;

public class Employeemain {
   
    public static void main(String[] args) {
        Employee emp1=new Employee(23, "hari", 04);
        Employee emp2=new Employee(24, "hari", 04);
        Employee random=new Employee(emp1);
        System.out.println(emp2.age);
        System.out.println(random.age);
    }
}
