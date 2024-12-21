package AccentureTcs;
public class StrongNumber {
    public static void main(String[] args) {
        int num=145;
        int temp;
        int sum=0;
        temp=num;
        while(temp>0){
            int digit=temp%10;
            int fact=1;
            for(int i=1;i<=digit;i++){
                fact=fact*i;
            }
            sum=sum+fact;
            temp=temp/10;
        }
        if(sum==num){
            System.out.println("Strong number");
        }else{
            System.out.println("Not a Strong number");
        }
    }
    
}
