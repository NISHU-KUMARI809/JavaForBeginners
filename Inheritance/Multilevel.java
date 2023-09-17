package Inheritance;
class Animal{
    void eat(){
        System.out.println("Eating");
    }
}
class Dog extends Animal{
    void a(){
        System.out.println("Dog starts barksing");
    }
}
class Ant extends Dog{
    void b(){
        System.out.println("Ant is an insect");
    }
}
class Cow extends Ant{
    void d(){
        System.out.println("Cow gives us milk");
    }
}
public class Multilevel {
    public static void main(String[] args) {
        Cow c=new Cow();
        c.eat();
        c.a();
        c.b();
        c.d();
    } 
}
