/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CollegePracticeQt;

public class Vowel {
    public static void main(String[] args) {
        String x="uiet is an enginnering college since 2004";
        x=x.toLowerCase();
        int v=0,c=0,d=0,s=0;
        for(int i=0;i<x.length();i++){
            char ch=x.charAt(i);
            if(ch >='a'&& ch<='z'){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    v++;
                }else{
                    c++;
                } 
            }else if(ch>='0' && ch<='9'){
                d++;
            }else if(ch==' '){
                s++;
            }
        }
        System.out.println(v);
        System.out.println(c);
        System.out.println(d);
        System.out.println(s);
    }
    
}
