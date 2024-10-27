public class ThrowEx1 {
    public static void validate(int age){
        if(age<18){
            throw new ArithmeticException("Person is not eligible to voate");
        }
        else{
            System.out.println("Person is  eligible for vote!");
        }
    }public static void main(String[] args) {
        validate(19);
        System.out.println("rest of code.....");
    }
    
}
