
package demoproject;
import java.util.*;
public class Marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks obtained in java:");
        float x=sc.nextFloat();
        System.out.println("Enter the marks obtained in maths:");
        float y=sc.nextFloat();
        System.out.println("Enter the marks obtained in python:");
        float z= sc.nextFloat();
        System.out.println("Enter the marks obtained in cpp:");
        float v=sc.nextFloat();
        System.out.println("Enter the marks obtained in c:");
        float c=sc.nextFloat();
        int total=500;
        float sum = (x+y+z+v+c);
        float percentage= (sum/total)*100;
        System.out.println("Percentage is equal to:"+percentage);
        
    }
    
}
