/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demoproject;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int factorial=1;
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            factorial=factorial*i;    
        }
        System.out.println("Factorial is equal to:"+factorial);
        
    }
    
}
