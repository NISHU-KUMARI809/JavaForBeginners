package Function__n;

import java.util.Scanner;

public class Factorial {
    public static int fact(int x){
        int fc=1;
        for(int i=1;i<=x;i++){
            fc=fc*i;
        }
            return fc;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int nfact=fact(n);
        int nmrfact=fact(n-r);
        int npr=nfact/nmrfact;
        System.out.println(npr);


        
    }
    
}
