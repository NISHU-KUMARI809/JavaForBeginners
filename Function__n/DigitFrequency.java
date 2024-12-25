package Function__n;
import java.util.Scanner;
public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st Number:");
        int n=sc.nextInt();
        System.out.println("Enter the Second Number:");
        int d=sc.nextInt();
        int f=values(n,d);
        System.out.println("Frequency Of digit is:"+f);
    
    }
    public static int values(int num,int dig){
        int count=0;
        while(num>0){
            int r=num%10;
            num=num/10;
            if(r==dig){
                count++;
            }
        }
        return count;
    }
    
}
