package AccentureTcs;

import java.util.Scanner;

public class PrimeNumberWithinRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Lower Limit:");
        int low_Limit=sc.nextInt();
        System.out.println("Enter the Higher limit:");
        int higher_limit=sc.nextInt();
        for(int i=low_Limit;i<=higher_limit;i++){
            int count=0;
            for(int n=2;n*n<=i;n++){
                if(i%n==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println(i+" Prime number");
            }
            else{
                System.out.println(i+" Not a Prime Number");
            }
        }

        
    }
    
}
