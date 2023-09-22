//package CollegePracticeQt;
import java.util.Scanner;
public class ExceptionHandling {
    public static void main(String[] args) {
        try{
            System.out.println("Enter the values:");
            Scanner sc=new Scanner(System.in);
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=x/y; 
            System.out.println(z);

        }
        catch(Exception e){
            System.out.println("Array out of bound...");
        }     
    }
    
}
