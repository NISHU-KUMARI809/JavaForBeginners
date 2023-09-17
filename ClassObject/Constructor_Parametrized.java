//package ClassObject;
class Name{
    int rollno;
    String name;
    Name(int x,String y){ //parametrized constructor
        rollno=x;
        name=y;
       // 
    }
    void display(){
        System.out.println("Rollno is:"+rollno);
        System.out.println("Name is:"+name);
    }
}
public class Constructor_Parametrized {
    public static void main(String[] args) {
        
        Name n1=new Name(1234,"karan");
        Name n2=new Name(1234,"siya");
        n1.display();
        n2.display();
    }

}
