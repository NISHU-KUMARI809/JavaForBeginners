package AccentureTcs;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num=121;
        int temp;
        int rev=0;
        int rem;
        temp=num;
        while(temp!=0){
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        if(num==rev){
            System.out.println("the number is pallindrome");
        }else{
            System.out.println("Number is not palindrome");
        }
    }
    
}
