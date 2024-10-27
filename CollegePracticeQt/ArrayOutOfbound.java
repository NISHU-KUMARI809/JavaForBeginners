//package CollegePracticeQt;
import java.util.Scanner;
public class ArrayOutOfBound {
    public static void main(String[] args) {
        try{
            int sum=0;
            Scanner sc=new Scanner(System.in);
            int x=sc.nextInt();
            int []a={1,2,3,4,5};
            //System.out.println("Enter the elements:");
            //for(int i=0;i<5;i++){
                //a[i]=sc.nextInt();
            for(int i=0;i<5;i++){
                sum+=sum+a[i];
                System.out.println(sum/5);
            }

        } 
        catch(Exception e){
            System.out.println(e);
        }
    }  
}
