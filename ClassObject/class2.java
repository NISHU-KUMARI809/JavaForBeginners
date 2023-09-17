
package ClassObject;
class Calculator{
    int a,b;
    Calculator(int x,int y){
        a=x;
        b=y;
    }
    void display(){
        System.out.println("The addition of numbers is:"+(a+b));
    }
}
public class class2 {
    public static void main(String[] args) {
        Calculator c1=new Calculator(20,30);
        c1.display();
    }
//    Calculator c1=new Calculator(20,30);
//    c1.display();
    
}
