
package Strings;
public class ReverseUsingStringBuilder {
    public static void main(String[] args) {
        
        StringBuilder sb=new StringBuilder("hello");
        for(int i=0;i<sb.length()/2;i++){
            int front=i;
            int back=sb.length()-1-i;
            char frontChar=sb.charAt(front);// extract front char
            char backChar=sb.charAt(back); // extract back char
            
            sb.setCharAt(front,backChar); // replace front with back
            sb.setCharAt(back, frontChar); // replace back with front
        }
        System.out.println(sb);
    
    }
    
}
