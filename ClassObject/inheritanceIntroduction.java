
//package ClassObject;
class Animal{ //parent class 
    void eat(){
        System.out.println("I am Eating");
    }
}
class Dog extends Animal{ //child class
    public static void main(String[] args) {
        Dog d=new Dog();
        d.eat();  
    }
    
}
public class inheritanceIntroduction {
    
}
