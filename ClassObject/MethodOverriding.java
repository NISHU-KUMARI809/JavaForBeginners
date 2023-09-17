package ClassObject;
class Vehicle{
    void run(){
        System.out.println("Vehicles is running");
    }
}
public class MethodOverriding extends Vehicle {
    void run(){
        System.out.println("Bike is running Safely");
    }
    public static void main(String[] args) {
        MethodOverriding obj=new MethodOverriding();
        obj.run();
    }
    
}
