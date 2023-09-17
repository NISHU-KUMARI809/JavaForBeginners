package demoproject;
import java.util.Scanner;
public class PrintingNnaturalNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x:");
        int x=sc.nextInt();
        for(int i=0;i<x;i++){
            System.out.println(i);
        }
        
    }
    
}
