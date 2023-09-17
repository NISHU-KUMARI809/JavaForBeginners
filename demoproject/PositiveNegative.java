package demoproject;
import java.util.Scanner;
public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x:");
        int x=sc.nextInt();
        if(x>0){
            System.out.println("Number is positive"+x);
        }
        else if(x<0){
            System.out.println("Number is negative"+x);
        }
        else{
            System.out.println("Number is zero"+x);
        }
        
    }
    
}
