import java.util.Scanner;
public class Exception3ArrayOutOfBound {
    int i;
    void demo() throws ArrayIndexOutOfBoundsException{
        int arr[]={1,2,3,4,5};
        for(i=0;i<=arr.length;i++){
            if(i<=arr.length){
                throw new ArrayIndexOutOfBoundsException("Array is out of bound exception");
            }
            else{
                System.out.println(arr[i]+" ");
            }
        }   

    }
    public static void main(String[] args){
        try{
            Exception3ArrayOutOfBound e=new Exception3ArrayOutOfBound();
            e.demo();
    }
    catch(ArrayIndexOutOfBoundsException ex){
        System.out.println("Array length is too long to execute");
        System.out.println(ex.getMessage());
    }
 }
    
}
