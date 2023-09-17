package ClassObject;
class Calculator{
    public int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    public int add(int n1,int n2){
        return n1+n2;
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Calculator c1=new Calculator();
        int r1=c1.add(3,4);
        int r2=c1.add(20,30,40);
        System.out.println(r1);
         System.out.println(r2);
        
    }
    
}
