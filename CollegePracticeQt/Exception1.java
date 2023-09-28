//package CollegePracticeQt;
// exception divide by zero
import java.util.Scanner;
public class Exception1 {
    void demo() throws ArithmeticException{
        System.out.println("Enter the values:");
         Scanner sc=new Scanner(System.in);
         int x=sc.nextInt();
         int y=sc.nextInt();
         if(y==0){
            throw new  ArithmeticException("Cannot be divide by 0");
         }
         else{
            int z=x/y;
            System.out.println("The division is equal to:");
            System.out.println(z);
         }
        // throw new  ArithmeticException("Cannot be divide by 0");
    }
    public static void main(String[] args) {
        try{
            Exception1 ex=new Exception1();
            ex.demo();
        }
        catch(ArithmeticException e){
            System.out.println("An exception is throwned");
            System.out.println(e.getMessage());
        }

    }

        
}
