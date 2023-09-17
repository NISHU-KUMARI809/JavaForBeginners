package demoproject;
import java.util.Scanner;
public class GreaterSmaller {
  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        int x=sc.nextInt();
        System.out.println("Enter the 2nd number:");
        int y=sc.nextInt();
        System.out.println("Enter the 3rd number:");
        int z=sc.nextInt();
        if(x>y && x>z){
            System.out.println("Greatest number is: "+x);
        }
        else if(y>x && y>z){
            System.out.println("Greatest number is:"+y);
        }
        else{
            System.out.println("Greatest number is:"+z);
        }
    
    }
    
}
    
