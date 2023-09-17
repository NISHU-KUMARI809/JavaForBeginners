/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassObject;
class Student{
    int roll_no;
    String name;
    Student(int x,String y){
        roll_no=x;
        name=y;   
    }
    void display(){
        System.out.println("Name is:"+name);
        System.out.println("Rollno is:"+roll_no);
    }
}
public class StudentClass {
    public static void main(String[] args) {
        Student s1=new Student(25,"Nishu Kumari");
        s1.display();
        
    }
    
}
