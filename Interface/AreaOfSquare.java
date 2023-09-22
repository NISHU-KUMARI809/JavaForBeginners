//package Interface;
import java.util.Scanner;
interface Sqaure{
    void  side();
}
interface area{
    void ar();
}
class AreaOfSquare implements Sqaure, area{
    int res;
    public void side(){
        Scanner a=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int n=a.nextInt();
       
        res=n*n;
    }
    public void ar(){
        System.out.println("Area of square is equal to:"+res);
    }
    public static void main(String[] args) {
        AreaOfSquare c=new AreaOfSquare();
        c.side();
        c.ar();
    }
    
    
}
