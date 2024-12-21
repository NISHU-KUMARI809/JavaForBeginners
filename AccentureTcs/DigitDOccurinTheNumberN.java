package AccentureTcs;

public class DigitDOccurinTheNumberN {
    public static void main(String[] args) {
        int n=12214242;
        int d=2;
        int count=0;
        while(n!=0){
            int dig=n%10;
            if(dig==d){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
        
    }
    
}
