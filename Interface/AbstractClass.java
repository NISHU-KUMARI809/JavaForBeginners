abstract class Ab {
    void data(){
        int x=20;
        int y=30;
        int z=x+y;
        System.out.println("Addition is:"+z);
    }  
    abstract void addition();
}
class Sumofnumber extends Ab{
    void fun(){
        System.out.println("Derived class is called");
    }
    void addition(){
        System.out.println("abstract function called");
    }

}
class AbstractClass{
    public static void main(String[] args) {
        //AbstractClass ab=new Sumofnumber();
        Sumofnumber s=new Sumofnumber();
        s.data();
        s.addition();
        s.fun();

    }
}
