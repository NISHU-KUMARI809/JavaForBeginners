package demoproject;
import java.util.Scanner;
//program to find sum of even and product of odd number
public class SumofEvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int sum=0,product=1;
        int n=sc.nextInt();
        for(;n>0;n=n/10){
            if(n%2==0){
                sum=sum+(n%10);
            }
            else{
                product=product*(n%10);
            }
        }
        System.out.println("Sum of even is:"+sum);
        System.out.println("Product of odd is:"+product);     
    }
    
}
