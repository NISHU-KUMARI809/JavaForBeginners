package demoproject;
import java.util.Scanner;
public class SumofFirstNnumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x:");
        int x=sc.nextInt();
        int sum=0;
        for(int i=0;i<x;i++){
            sum=sum+i;  
        }
        System.out.println(sum);
        
        
        
    }
    
}
