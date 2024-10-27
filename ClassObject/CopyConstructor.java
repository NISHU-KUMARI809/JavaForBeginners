
//package ClassObject;
class Student{
    int id;
    String name;
    Student(int x,String y){
        id=x;
        name=y;
    }
    Student(Student s){
        id=s.id;
        name=s.name;
    }
    void display(){
        System.out.println(id+" "+name);
    }
}
public class CopyConstructor {
    public static void main(String[] args) {
        Student obj=new Student(111,"nishu");
        Student obj1=new Student(101,"Riya");
        obj.display();
        obj1.display();
        
    }
    
    
}
