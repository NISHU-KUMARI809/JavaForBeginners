//package Interface;
import java.util.Scanner;
interface Abc{
    void area();
}
class AreaOfCube implements Abc{
    public void area(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a=sc.nextInt();
        System.out.println("The area is equal to:");
        System.out.println(6*a*a);

    }
    public static void main(String[] args) {
        AreaOfCube a=new AreaOfCube();
        a.area();
        //System.out.println(a);
    }
    
}
