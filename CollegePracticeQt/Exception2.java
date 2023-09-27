//package CollegePracticeQt;
import java.util.Scanner;
public class Exception2 {
    public static void main(String[] args) throws ArithmeticException {
        System.out.println("Enter the number:");
        Scanner s=new Scanner(System.in);
        try{
            int x=s.nextInt();
            int y=s.nextInt();
            if(y==0){
                throw new ArithmeticException("The number is zero");
            }
            else{
                int z=x/y;
                System.out.println("The division is equal to:");
                System.out.println(z);
            }
        }
        catch(ArithmeticException e){
            System.out.println("An exception is thrown");
            System.out.println(e.getMessage());
        }  
    }

}
