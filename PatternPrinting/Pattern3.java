package PatternPrinting;

public class Pattern3 {
    public static void main(String[] args) {
        int n=4;
        int m=4;
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println();
    }
    
}
