package oops.Objectclass;

public class Employee implements Cloneable {
    int id;
    String name;
    EmployeeAddress address;
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee() {
    }

    public Employee(int id) {
        this.id = id;
    }

    public Employee(int id, String name, EmployeeAddress address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Employee(String name) {
        this.name = name;
    }
    void display(){
        System.out.println(this.id+" "+this.name);
        System.out.println(this.address.city + " " + this.address.doorno);

    }

    public Employee(EmployeeAddress address) {
        this.address = address;
    }
    
}
