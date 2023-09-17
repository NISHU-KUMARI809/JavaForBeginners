package demoproject;
import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,op;
        System.out.println("1-Add\n 2- Subtract \n 3- Multiply \n 4- Divide");
        System.out.println("Choose Operator:");
        op=sc.nextInt();
        System.out.println("Enter the 1st number:");
        a=sc.nextInt();
        System.out.println("Enter the 2nd number:");
        b=sc.nextInt();
        int result=0;
        switch(op)
        {
            case 1:
                result=a+b;
                break;
            case 2:
                result=a-b;
                break;
            case 3:
                result=a*b;
                break;
            case 4:
                result=a/b;
                break;
            default:
                System.out.println("Invalid");
                       
        }
        System.out.println("Result is:"+result);
    }
    
}
