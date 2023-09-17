/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package demoproject;
import java.util.Scanner;
public class AverageOfArrayElements {
    public static void main(String[] args) {
        System.out.println("Enter the size of array:");
        Scanner sc=new Scanner(System.in);
        double sum=0;
        int n=sc.nextInt();
        double a[]=new double[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextDouble(); 
            sum=sum+a[i];
        }
        System.out.println("Average is:"+sum/n);
        
        
    }
    
}
