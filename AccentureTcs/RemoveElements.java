package AccentureTcs;

import java.util.Arrays;

public class RemoveElements {
    public static void main(String[] args) {
        int n[]={3,2,2,3};
        int val=3;
        int count=0;
        for(int i=0;i<n.length;i++){
            if(n[i]!=val){
                n[count]=n[i];
                count++;
            }
        }
        // count is an integer, not an array.
        //Use Arrays.copyOf to create a new array with only the valid elements (up to count).
        int res[]=Arrays.copyOf(n,count);
        System.out.println(Arrays.toString(res));
    }
    
}
