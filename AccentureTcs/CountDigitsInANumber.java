package AccentureTcs;
public class CountDigitsInANumber {
    public static void main(String[] args) {
        int num=789654;
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        System.out.println(count);
        
    }
    
}
