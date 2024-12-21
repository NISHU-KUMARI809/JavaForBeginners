package AccentureTcs;
import java.io.*;
public class PerfectSquare {
    public static void main(String[] args) {
        int num=49;
        if(Math.floor(Math.sqrt(num))==Math.ceil(Math.sqrt(num))){
            System.out.println("Perfect Square");
        }
        else{
            System.out.println("Not Perfect Square");
        }
    }
    
}
