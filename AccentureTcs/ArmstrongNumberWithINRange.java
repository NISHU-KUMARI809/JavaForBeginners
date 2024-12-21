package AccentureTcs;
public class ArmstrongNumberWithINRange {
    public static void main(String[] args) {
        int start=1, end=200,i,temp,digit;
        for(i=start;i<=end;i++){
            temp=i;
            int sum=0;
            int count=0;
            while(temp>0){
                count=count+1;
                temp=temp/10;
            }
            temp=i;
            while(temp>0){
                digit=temp%10;
                int prod=1;
                for(int j=1;j<=count;j++){
                    prod=prod*digit;
                }
                sum=sum+prod;
                temp=temp/10;
            }
            if(sum==i){
                System.out.println(i+" is Armstrong Number");
            }
        }
    }
    
}