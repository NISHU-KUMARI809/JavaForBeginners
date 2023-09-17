package ClassObject;
class Addition{
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public String add(String a,String b){
        return a+b;
    }
    

}
public class MethodOverloading1 {
    public static void main(String[] args) {
        Addition a=new Addition();
        int r1=a.add(20,30);
        String r2=a.add("Ram","Shyam");
        int r3=a.add(20,30,40);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
    
}
