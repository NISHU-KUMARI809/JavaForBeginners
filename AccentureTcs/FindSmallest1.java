package AccentureTcs;

public class FindSmallest1 {
    public static void main(String[] args) {
        int arr[]={11,22,5,6,7,3,8};
        int small=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<small){
                small=arr[i];
            }
        }
        System.out.print(small);
    }
    
}
