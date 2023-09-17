/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// default constructor 
//package ClassObject;
class Bike{
    int id;
    String name;
    void display(){
        System.out.println(id+" "+name);
    }
}

public class Constructors {
    public static void main(String[] args) {
        Bike b1=new Bike();
        Bike b2=new Bike();
        b1.id=20;
        b1.name="Sharika";
        b2.name="vaishnavi";
        b2.id=22;
        b1.display();
        b2.display();
    }
    
}
