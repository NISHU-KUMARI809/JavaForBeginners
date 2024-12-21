package AccentureTcs;
public class ArmstrongNumber {
    public static void main(String[] args) {
        int n=153;
        int z,count=0,digit,sum=0;
        z=n;
        while(z>0){
            count=count+1;
            z=z/10;
        }
        z=n;
        while(z>0){
            int prod=1;
            digit=z%10;
            for(int i=1;i<=count;i++){
                prod=prod*digit;
            }
            sum=sum+prod;
            z=z/10;
        }
        if(sum==n){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not Armstrong");
        }
    }
    
}
