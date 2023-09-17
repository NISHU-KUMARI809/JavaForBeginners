package demoproject;
import java.util.Scanner;
public class Palindrom {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        int z=n;
        int rev=0;
        for(;n>0;n=n/10){
            rev=(rev*10)+n%10;    
        }
        if(rev==z){
                System.out.println("Palindrom");  
            }else{
                System.out.println("Not a palindrom");
            }
        
    }
    
}
