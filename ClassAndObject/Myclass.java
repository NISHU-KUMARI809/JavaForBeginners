package ClassAndObject;
public class Myclass {
    public static void main(String[] args) {
        Student mark=new Student();
        mark.id=1;
        mark.name="Mark";
        mark.age=15;
        Student tom=new Student();
        tom.id=2;
        tom.name="Tom";
        tom.age=32;
        
        System.out.println(mark.id+"."+mark.name+" is "+ mark.age +" year old");
        System.out.println(tom.id+"."+tom.name+" is "+ tom.age +" year old");
        
    }
    
    
}
