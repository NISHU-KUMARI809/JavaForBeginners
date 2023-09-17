
//package ClassObject;
class Pen{
    String color;
    String type;
    public void write(){
        System.out.println("Writing something");
    }
    public void printColor(){
        System.out.println(this.color); // this is keyword jo btaega is fun ko kis object ne call kiya h
      
    }
    
}

public class class1 {
    public static void main(String[] args) {
            Pen pen1=new Pen(); // Pen() is constructor
            pen1.color="blue";
            pen1.type="gel";
            pen1.write();
            System.out.println("colour of pen is:"+pen1.color);
            System.out.println("colour of pen is:"+pen1.type);
            Pen pen2=new Pen();
            pen2.color="black";
            pen2.type="ballpoint";
            pen1.printColor();
            pen2.printColor();
            
        
    }
    
}
