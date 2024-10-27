interface area{
    void abc();
}
public class AreaOfCuboid implements area {
    public void abc(){
        int l=2;
        int b=6;
        int h=3;
        System.out.println("Area of cuboid is equal to:"+2*(l*b+l*h+b*h));
    }
    public static void main(String[] args) {
        AreaOfCuboid a=new AreaOfCuboid();
        a.abc();
    }
    
}
