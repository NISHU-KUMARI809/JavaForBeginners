package demoproject;
import java.util.Scanner;
public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int z=sc.nextInt();
        int rev=0;
        for(;z>0;z=z/10){
            rev=(rev*10)+z%10;
        }
        System.out.println(rev);
        
    }
    
}
