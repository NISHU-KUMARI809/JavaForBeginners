package AccentureTcs;

import java.util.Scanner;

public class PrintDigitOfTheNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int node=0;
        int temp=n;
        while(temp>0){
            temp=temp/10;
            node++;
        }
        int div=(int)Math.pow(10, node-1);
        while(div!=0){
            int q=n/div;
            System.out.println(q);
            n=n%div;
            div=div/10;
        }
    }
    
}
