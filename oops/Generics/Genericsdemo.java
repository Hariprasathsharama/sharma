package oops.Generics;

public class Genericsdemo<T> {
     T obj;

    public Genericsdemo(T obj) {
        this.obj = obj;
    }
    void display(){
        System.out.println(obj.getClass().getTypeName());
    }
    


    }
