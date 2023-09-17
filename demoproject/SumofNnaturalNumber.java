package demoproject;
import java.util.*;
public class SumofNnaturalNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        //System.out.println("values are:");
        int sum=0;
        for(int i=0;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("Sum is:"+sum);
        
        
    }
    
}
