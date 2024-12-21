package TCS_Coding;

public class Median {
    public static void main(String[] args) {
        int num[]={2,5,1,7};
        int n=num.length;
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]>num[j]){
                    int temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }
        }
        if(num.length%2!=0){
            int idx=num.length/2;
            System.out.println("Median:"+num[idx]);

        }
        else{
            int idx=num.length/2;
            double md=(double)(num[idx]+num[idx-1])/2;
            System.out.println("Median:"+md);
        }
    }
    
}
