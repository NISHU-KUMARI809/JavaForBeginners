package demoproject;
import java.util.Scanner;
public class CALusingSwitchCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st value:");
        int x=sc.nextInt();
        System.out.println("Enter 2nd value:");
        int y=sc.nextInt();
        System.out.println("Enter the choice 1-> Add/n 2-> Subtract/n 3-> Multiply/n 4-> Divide");
        int op=sc.nextInt();
        switch(op){
            case 1:
                System.out.println("Addition is equal to:"+(x+y));
                break;
            case 2:
                System.out.println("Subtraction is equal to:"+(x-y));
                break;
            case 3:
                System.out.println("Multiplication is equal to:"+(x*y));
                break;
            case 4:
                System.out.println("Division is equal to:"+(x/y));
                break;
            default:
                System.out.println("Invalid operation");
        }
        
    }
    
}
