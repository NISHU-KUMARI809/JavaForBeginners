//package ExceptionHndling;
import java.util.Scanner;
public class MultipleCatchss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values:");
        try{
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=x/y;
            System.out.println(z);
            int a[]=new int[5];
            System.out.println("Enter the value inside the array:");
            for(int i=0;i<=5;i++){
                a[i]=sc.nextInt();
            }
            for(int i=0;i<=5;i++){
                System.out.println(a[i]);
            }
        }
        catch(ArithmeticException e){
            System.out.println("Cannot be divided by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of bound");
        }
    }
    
}
