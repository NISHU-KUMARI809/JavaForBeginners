class BaseClass{
    int num=10;
}
class Subclass1 extends BaseClass{
    int n1=1;
}
class Subclass2 extends BaseClass{
    int n2=2;
}
class Subclass3 extends BaseClass{
    int n3=3;
}
public class Hierarchical {
    public static void main(String[] args) {
        Subclass1 ob1=new Subclass1();
        Subclass2 ob2=new Subclass2();
        Subclass3 ob3=new Subclass3();
        System.out.println("ParentNum*childNum1="+ob1.num*ob1.n1);
        System.out.println("ParentNum*childNum2="+ob2.num*ob2.n2);
        System.out.println("ParentNum*childNum3="+ob3.num*ob3.n3);
    }   
}
