package oops.Objectclass;

public class Employeemain {
    public static void main(String[] args) {
        Employee emp1=new Employee(1,"hari");
        EmployeeAddress address1=new EmployeeAddress("madurai", 39);
        Employee emp1add=new Employee(address1);
        emp1add.display();
        Employee e1=new Employee(2,"zerome",address1);
        e1.display();
        // Employee e3=e1
    }
}
