package Pattern;
import java.util.Scanner;
public class DiamondShape {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int n=sc.nextInt();
        int sp=n/2; // 5 line ke liye 2 space ek star
        // 7 line ke liye 3 space 1 star
        int st=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=st;j++){
                System.out.print("*");
            }
            if(i<=n/2){ //n/2 tak star bdhey fir star ghtne lge
                sp--;
                st+=2;
            }else{
                sp++;
                st-=2;
            }
            System.out.println();

        }
        
    }
    
}
