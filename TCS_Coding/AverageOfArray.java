package TCS_Coding;

public class AverageOfArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int n=7;
        double sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        double avg=sum/n;
        System.out.println(avg);
    }
    
}
