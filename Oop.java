
class Student {
int rno;
String name;
int marks;
    
Student(){
    this.rno=1;
    this.name="hari";
    this.marks=100;
}
Student(int rno,String name,int marks){
this.rno=rno;
this.name=name;
this.marks=marks;
}
void Number(){
    System.out.println(marks);
}
Student(Student other){
    this.name=other.name;
    this.rno=other.rno;
    this.marks=other.marks;
    
}
}
public class Oop {
    public static void main(String[] args) {
        Student s2=new Student();
        System.out.println(s2.name);
        s2.Number();
        Student s1=new Student(2,"sharma",90);
        System.out.println(s1.rno);
        Student s3=new Student(s1);//object passing
        System.out.println(s3.marks);
        
        Oop obj=new Oop();
        obj.hello();//without static

        //withstatic
        Hello();
    }

    void hello(){
        System.out.println("hello bro");
    }
    static void Hello(){
        System.out.println("static hello");
    }
}
