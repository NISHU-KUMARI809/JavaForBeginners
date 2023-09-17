
package demoproject;
import java.util.Scanner;
public class ArrayMatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        int c[][]=new int[3][3];
        int i,j,k;
        System.out.println("Enter the elements of 1st matrix:");
        
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                a[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("Enter the elements of 2nd matrix:");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                b[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<3;i++){ //row
            for(j=0;j<3;j++){ //columns
                c[i][j]=0;
                for(k=0;k<3;k++){ 
//  for iterate row and column of 2 different matrix ,,we are taking k here because here i have to work in 1st row 1st colum 2nd row 2nd colum and so on for this comparision we are taking one more loop that is k 
                    c[i][j]=c[i][j]+a[i][k]*b[k][j]; 
//so that the multiplication result will store at c[i][j] location
// example: [2,2,2]   [2,2,2] c[i][j]=0+2*2=4,c[i][j]=4+2*2=8,c[i][j]=8+2*2=12 and so on in similar way 
 //         [2,2,2]   [2,2,2]
//          [2,2,2]   [2,2,2]              
                }
            }
        }
        System.out.println("Multiplication is:");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print(c[i][j]+" ");  
            }
            System.out.println();
        }
        
        
    }
    
}
