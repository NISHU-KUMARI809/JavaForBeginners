package demoproject;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        //input
        System.out.println("Enter the values inside the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();   
        }
        //output
        System.out.println("Array values are:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        
    }
    
}