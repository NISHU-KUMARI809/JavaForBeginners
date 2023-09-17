package Strings;
public class ReverseString {
    public static void main(String[] args) {
        String name="deepak";
        String rev = " "; //taking an empty variable
        int lang=name.length();
        for(int i=lang-1;i>=0;i--){
            rev=rev+name.charAt(i);     
        }
        System.out.print(rev);
    }
    
}
