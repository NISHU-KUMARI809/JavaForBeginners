/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demoproject;
public class ArraySum {
    public static void main(String[] args) {
        int a[]={1,2,3};
        sum(a);
    }
    public static void sum(int[]x){
        int sum=0;
        for(int i=0;i<x.length;i++){
            sum=sum+x[i];
            System.out.println(sum);
        }
    }
    
}
