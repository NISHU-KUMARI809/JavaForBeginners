//package ExceptionHndling;
import java.util.Scanner;
public class NestedTryCatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter the values:");
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=x/y;
            try {
                System.out.println("Enter the array elements:");
              int a[]=new int[5];
              for(int i=0;i<=5;i++){
                a[i]=sc.nextInt();
            }
              for(int i=0;i<=5;i++){
                System.out.println(a[i]);
              }
            } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of bound");
          } 
        }catch(Exception e){
            System.out.println("Divide by zero");

        }
    }
    
}
