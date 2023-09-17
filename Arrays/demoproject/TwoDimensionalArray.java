package demoproject;
public class TwoDimensionalArray {
    public static void main(String[] args) {
        int [][] arr={{1,2,3,4},
                      {3,6,7,8},
                      {12,13,14,15}
                     };
        for(int i=0;i<3;i++){ //rows
            for(int j=0;j<4;j++){ //columns
                System.out.print(arr[i][j]+" ");
            }
        System.out.println();    
        }
    }
    
}
