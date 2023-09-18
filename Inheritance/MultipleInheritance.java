//package Inheritance;
interface A{
    void show(); //public+abstract
}
interface B{
    void show(); //public+abstract
}

public class MultipleInheritance implements A,B{
    public void show(){
        System.out.println("Interface A and B");
    }
    public static void main(String[] args) {
        MultipleInheritance m=new MultipleInheritance();
        m.show();
    }
    
}
