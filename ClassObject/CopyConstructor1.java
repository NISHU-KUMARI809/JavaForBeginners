
package ClassObject;
class Marks{
    int marks1;
    int marks2;
    Marks(int x,int y){
        marks1=x;
        marks2=y;
    }
    Marks(Marks m){
        marks1=m.marks1;
        marks2=m.marks2;
    }
    void display(){
        System.out.println("Marks of 1st subject is:"+marks1);
        System.out.println("The marks of 2nd subject is:"+marks2);
    }
}
public class CopyConstructor1 {
    public static void main(String[] args) {
        Marks m1=new Marks(20,30);
        Marks m2=new Marks(30,40);
        m1.display();
        m2.display();
        
    }
    
    
}
