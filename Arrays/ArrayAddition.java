
// package demoproject;
import java.util.Scanner;
public class ArrayAddition {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the values:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt(); 
        }
        System.out.println("Addition is:");
        for(int i=0;i<n;i++){
            sum=sum+a[i];    
        }
        System.out.println(sum);
        
    }
    
}
