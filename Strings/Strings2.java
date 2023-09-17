package Strings;
import java.util.*;
public class Strings2 {
    public static void main(String[] args) {
        String f1="tony";
        String lastname="Stark";
        String fulname=f1+" "+lastname;
        System.out.println(fulname.length());
        
        //charAt
        for(int i=0;i<f1.length();i++){
            System.out.println(f1.charAt(i));
        }
    }
    
}
