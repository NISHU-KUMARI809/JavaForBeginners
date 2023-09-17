// Take an array as input from user. Search for a given number x and print the index at which it occurs
//package demoproject;
import java.util.Scanner;
public class Array1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        System.out.println("Enter the value you want to search:");
        int x=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the value:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                System.out.println("Elememnt found at the index:"+i);
                //
            }
            
        }      
    }
}
