package AccentureTcs;
public class ReverseANumber {
    public static void main(String[] args) {
        int n=123;int rem;
        while(n>0){
            rem=n%10;
            n=n/10;
            System.out.print(rem);

        }
    }
    
}
