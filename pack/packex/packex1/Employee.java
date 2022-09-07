package pack.packex.packex1;

public class Employee {
    int age;
    String name;
    int number;
    
    public Employee(int age, String name, int number) {
        this.age = age;
        this.name = name;
        this.number = number;
    }
    Employee(Employee other){
        this.age=other.age;
    }

    
}
