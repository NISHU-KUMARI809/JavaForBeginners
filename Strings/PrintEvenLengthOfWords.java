//Java program to print even length words in a string 
package Strings;
public class PrintEvenLengthOfWords {
    public static void main(String[] args) {
        String s="hi i am Nishu what about you";
        for(String w : s.split(" ")){
            if(w.length()%2==0){
                System.out.println(w);
            }
        }
    }
    
}
