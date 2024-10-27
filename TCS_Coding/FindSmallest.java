package TCS_Coding;

public class FindSmallest {
    public static void main(String[] args) {
        int a[]={2,5,1,3,0};
        int n=a.length;
        int smallest=a[0];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        } 
        System.out.println();
        for(int i=0;i<n;i++){
            if(a[i]<smallest){
                smallest=a[i];
                System.out.println(smallest);
            }
        }

    }


}
