package NumberSystem;

import java.util.Scanner;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=basetodecimal(a, b);
        System.out.println(c);
        
    }
    public static int basetodecimal(int n,int d){
        int count=0;
        int pow=1;
        while(n>0){
            int dig=n%10;
            n=n/10;
            count+=dig*pow;
            pow=pow*d;
        }
        return count;
        
    }  
}
