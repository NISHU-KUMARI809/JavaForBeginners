package AccentureTcs;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value:");
        int num=sc.nextInt();
        int first_num=0;
        int second_num=1;
        for(int i=0;i<num;i++){
            System.out.print(first_num+" ");
            int thirdNum=first_num+second_num;
            first_num=second_num;
            second_num=thirdNum;
        }
    }
    
}
