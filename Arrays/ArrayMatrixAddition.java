
// package demoproject;
import java.util.Scanner;
public class ArrayMatrixAddition {
    public static void main(String[] args) {
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        int c[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        int i,j,k;
        System.out.println("Enter the elements for 1st array:");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                a[i][j]=sc.nextInt();
                
            }
        }
        System.out.println("Enter the elements for 2nd array");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                b[i][j]=sc.nextInt();
            }
        }
        // for printing output
        System.out.println("The Addition is:");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    
}
