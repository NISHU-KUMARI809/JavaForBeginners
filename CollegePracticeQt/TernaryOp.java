package CollegePracticeQt;
import java.util.*;
public class TernaryOp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks:");
        int n=sc.nextInt();
        String marks=(n>60)? "Pass":"fail";
        System.out.println("You "+marks+" the exam");
   
    }
    
}
