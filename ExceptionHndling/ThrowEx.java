public class ThrowEx{
    void div(int a,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException();
        }
        else{
            int c=a/b;
            System.out.println(c);
        }
    }
    public static void main(String[] args) {
        ThrowEx ex=new ThrowEx();
        try{
            ex.div(20,0);
        }
        catch(Exception e){
            System.out.println("The value of b is equal to zero");
        }
    }

}