package AccentureTcs;
//You are given a string S and your task is to find and return 
//the count of permutation formed by fixing the positions of the vowels present in the string
// ex: ABC output: 2 
import java.util.Scanner;
public class Permutation {
    public static void main(String[] args) {
        int cnst=0;
        System.out.print("Enter the String:");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='A' && str.charAt(i)!='E' && str.charAt(i)!='I' && str.charAt(i)!='O' && str.charAt(i)!='U'){
                cnst++;
            }
        }
        if(cnst==0){
            System.out.println("No consonant found permutation will be zero ");
            return;
        }
        int fact=1;
        for(int i=1;i<=cnst;i++){
            fact=fact*i;
        }
        System.out.println("Permutation with vowel="+fact);

    }
    
}
