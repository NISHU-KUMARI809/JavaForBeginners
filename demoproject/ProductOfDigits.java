package demoproject;
import java.util.Scanner;
public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        int product=1;
        for(;n>0;n=n/10){
            product=product*(n%10);        
        }
        System.out.println("Product is equal :"+product);
        
    }
    
}
