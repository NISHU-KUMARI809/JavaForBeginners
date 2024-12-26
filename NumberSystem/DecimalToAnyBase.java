package NumberSystem;

import java.util.Scanner;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nm=sc.nextInt();
        int dg=sc.nextInt();
        int res=decToAnyBase(nm, dg);
        System.out.println(res);
        
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
