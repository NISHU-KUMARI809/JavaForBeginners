package demoproject;
import java.util.Scanner;
public class SumofDigitsOfNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int x=sc.nextInt();
        int sum=0;
        for(;x>0;x=x/10){
            sum=sum+x%10;
        }
        System.out.println(sum);
        
        
    }
    
}
