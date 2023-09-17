package CollegePracticeQt;
import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,op;
        System.out.println("1-Addition\n 2-Subtraction\n 3-Multiplication\n 4-Division\n");
        System.out.println("Choose operator:");
        op=sc.nextInt();
        System.out.println("Enter 1st number:");
        a=sc.nextInt();
        System.out.println("Enter 2nd number:");
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
                System.out.println("None");
        }
        System.out.println("Result is:"+result);
    }
    
}
