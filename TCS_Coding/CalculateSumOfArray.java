package TCS_Coding;

public class CalculateSumOfArray {
    public static void main(String[] args) {
        int arr[]={1,2,4,3,5};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=arr[i]+sum;
        }
        System.out.println(sum);
    }
    
}
