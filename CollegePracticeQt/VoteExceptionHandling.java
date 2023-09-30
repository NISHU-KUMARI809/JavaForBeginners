//package CollegePracticeQt;
import java.util.Scanner;
class NotEligibleForVoteException extends Exception{
    NotEligibleForVoteException(String msg){
        System.out.println(msg);
    }

}
public class VoteExceptionHandling {
    public static void Age() throws NotEligibleForVoteException{
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the age:");
        int age=sc.nextInt();
        if(age<18){
            throw new NotEligibleForVoteException("Not eligible for vote");
        }else{
            System.out.println("ooh you are eligible for voting congrats..");
        }

    }
    public static void main(String[] args) {
        try{
            Age();
        }
        catch(NotEligibleForVoteException e){
            System.out.println("Sorry age is less than 18");
            //System.out.println(e.getMessage());
        }
    }
    
}
