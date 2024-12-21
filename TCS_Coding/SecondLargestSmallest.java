package TCS_Coding;
public class SecondLargestSmallest {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,6,7,8,9};
        if(arr.length<2){
            System.out.println("Array should have atleast two elements");
            return;
        }
        int maxx = Integer.MIN_VALUE;
        int sm = Integer.MAX_VALUE;
        int seLar = Integer.MIN_VALUE;
        int seSm = Integer.MAX_VALUE;
        // int maxx=arr[0];
        // int sm=arr[0];
        // int seLar=arr[0];
        // int seSm=arr[0];
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxx){
                //seLar=maxx;
                maxx=arr[i];
            }
            if(arr[i]<sm){
                //seSm=sm;
                sm=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>seLar && arr[i]<maxx){
                seLar=arr[i];
            }
            if(arr[i]<seSm && arr[i]>sm){
                seSm=arr[i];
            }
        }
        System.out.println(seLar);
        System.out.println(seSm);
    }
}

