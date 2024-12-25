package AccentureTcs;

import java.util.Scanner;

public class InverseOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int inv=0;
        int op=1; //original place
        while(n!=0){
            int od=n%10;//original digit
            int id=op; //original place hoga invereted digit 
            int ip=od;// original digit hoga inverted place
            inv=inv+id*(int)Math.pow(10,ip-1);
            n=n/10;
            op++;
        }
        System.out.println(inv);
        
    }
    
}
