package AccentureTcs;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int arr1[]={1,2,3,0,0,0};
        int arr2[]={2,5,6};
        int m=3;
        int n=arr2.length;
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(j>=0){
            if(i>=0 && arr1[i]>arr2[j]){
                arr1[k]=arr1[i];
                i--;
                k--;
            }
            else{
                arr1[k]=arr2[j];
                j--;
                k--;
            }
        }
       // System.out.println(arr1); it will print the reference to the array object something like this [I@15db9742]
       //so we have to use := Arrays.toString(arr1);
       System.out.println(Arrays.toString(arr1));

    }
    
}
