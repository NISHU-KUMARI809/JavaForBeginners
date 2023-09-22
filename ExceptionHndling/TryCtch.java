//package ExceptionHndling;

public class TryCtch {
    public static void main(String[] args) {
        try{
            int data=50/0;
        }
        catch(Exception e){
            System.out.println("Cant divided by zero");
        }
    }
    
}
