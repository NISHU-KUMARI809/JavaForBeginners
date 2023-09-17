package demoproject;
import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to find reverse:");
        int n=sc.nextInt();
        int rev=0;
        for(;n>0;n=n/10)
        {
            rev=(rev*10)+n%10;
        }
        System.out.println("Reverse of number is:"+rev);
        
    }
    
}
