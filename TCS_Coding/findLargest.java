package TCS_Coding;

public class findLargest {
    public static void main(String[] args) {
        int arr[]={1,7,2,4,9,3};
        int lrgst=arr[0];
        for(int i=0;i<arr.length;i++){
            lrgst=Math.max(arr[i],lrgst);
        }
        System.out.println(lrgst);
    }
    
}
