//arithmetic exception

//import java.net.SocketPermission;

public class ExceptionExample1 {
    public static void main(String[] args) {
        try{
            int x=20;
            int z=x/0;
        }
        catch(Exception ex){
            System.out.println(ex);
            //System.out.println("Rest of the code");

        }
        //int x=20;
    }
    
}
