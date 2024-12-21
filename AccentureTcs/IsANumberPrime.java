package AccentureTcs;
import java.util.Scanner;
public class IsANumberPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number:");
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            System.out.println("Enter the Value:");
            int n=sc.nextInt();
            int count=0;
            for(int j=2;j*j<=n;j++){
                if(n%j==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println("Prime Number");
            }
            else{
                System.out.println("Not Prime Number");
            }
        }
    }
    
}
