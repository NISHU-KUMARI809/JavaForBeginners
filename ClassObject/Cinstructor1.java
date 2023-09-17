/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package ClassObject;

class Student{
    String name;
    int age;
    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
}
public class Cinstructor1 {
    public static void main(String[] args) {
        Student s1=new Student("anmol",59);
        s1.printinfo();
    }
    
}
