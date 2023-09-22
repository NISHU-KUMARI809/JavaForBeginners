import java.util.Scanner;
interface sides{
    void si();
}
interface areas{
    void ai();
}

public class AreaOfRectangle implements sides, areas {
    int res;
    public void si(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length:");
        int length= sc.nextInt();
        System.out.println("Enter the breadth:");
        int breadth=sc.nextInt();
        res=length*breadth;
        
    }
    public void ai(){
        System.out.println("Area of rectangle is:"+res);
    }
    public static void main(String[] args) {
        AreaOfRectangle ab=new AreaOfRectangle();
        ab.si();
        ab.ai();
    }
    
}
