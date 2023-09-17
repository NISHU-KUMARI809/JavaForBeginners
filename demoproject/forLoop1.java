package demoproject;
import java.util.*;
public class forLoop1 {
    public static void main(String[] args) {
        //sum of 1st n natural numbers
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++)
        {
            sum=sum+i; 
        }
        System.out.println(sum);
    }
    
}
