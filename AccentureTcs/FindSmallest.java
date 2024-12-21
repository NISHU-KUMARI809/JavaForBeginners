package AccentureTcs;
public class FindSmallest {
    public static void main(String[] args) {
        int[]nums={12,11,22,33,43,1,2};
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }

        }
        System.out.print(nums[0]);

    }
    
}
