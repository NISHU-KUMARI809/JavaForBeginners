import java.io.*;
interface In1{
    final int a=10;
    void display();
}
class interface1 implements In1{
    public void display(){
        System.out.println("Geeks");
    }
    public static void main(String[] args) {
        interface1 i=new interface1();
        i.display();
        System.out.println(a);
        
    }
    
}
