
package CollegePracticeQt;
public class Stringss {
    public static void main(String[] args) {
        String x="uiet is an engineering college";
        x=x.toLowerCase();
        int v=0,c=0,d=0,sp=0;
        for(int i=0;i<x.length();i++){
            char ch=x.charAt(i);
            if(ch>='a'&& ch<='z'){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    v++;
                }else{
                    c++;
                }
            }else if(ch>=0 && ch<=9){
                d++;
            }else if(ch==' ')
            {
                sp++;
            }
            
        }
    System.out.println(v);
    System.out.println(c);
    System.out.println(d);
    System.out.println(sp);
        
    }
    
}
