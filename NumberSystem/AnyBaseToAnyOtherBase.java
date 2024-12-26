package NumberSystem;

import java.util.Scanner;

public class AnyBaseToAnyOtherBase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int b1=sc.nextInt();
        int des=Anybasetodecimal(a, b);
        int res=decToAnyBase(des,b1);
        System.out.println(res);


        
    }
    public static int Anybasetodecimal(int n,int d){
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
    public static int decToAnyBase(int n, int base){
        int returnvalue=0;
        int powr=1;// jovi value aate h usko reverse me return krte haina isliye chote poer lehge reverse krne keyliye
        while(n>0)
        { // jisme convert krna hota hai usey divide krte hai
            int digit=n%base;
            n=n/base;
            returnvalue +=digit*powr;
            powr=powr*10;
        }
        return returnvalue;
    }  
    
}
