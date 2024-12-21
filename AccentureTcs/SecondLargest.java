package AccentureTcs;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[]={12,23,24,55,6,7,8};
        int lar=Integer.MIN_VALUE;
        int secl=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>lar){
                secl=lar;
                lar=arr[i];
            }else if(arr[i]>secl && arr[i]<lar){
                secl=arr[i];
            }
        }
        System.out.print(secl);
        
    }

    
}
