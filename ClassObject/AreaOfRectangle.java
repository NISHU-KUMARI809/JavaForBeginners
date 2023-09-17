/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassObject;
class Area{
    int length;
    int breadth;
    void setDim(int l,int b){
        length=l;
        breadth=b;  
    }
    void getArea(){
        System.out.println("Area of rectangle is:"+(length*breadth));
    }
}
public class AreaOfRectangle {
    public static void main(String[] args) {
        Area a1=new Area();
        a1.setDim(20, 30);
        a1.getArea();
        
    }
    
}
