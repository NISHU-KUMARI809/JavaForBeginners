package AccentureTcs;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int num[]={1,1,2};
        int count=0;
        for(int i=0;i<num.length;i++){
            if(i<num.length-1 &&num[i]==num[i+1]){
                continue;
            }
            else{
                num[count]=num[i];
                count++;
                
            }
        }
        int res[]=Arrays.copyOf(num,count);
        System.out.println(Arrays.toString(res));

    }
    
}
