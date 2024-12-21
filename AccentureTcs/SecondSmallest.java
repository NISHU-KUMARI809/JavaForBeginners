package AccentureTcs;

public class SecondSmallest {
    public static void main(String[] args) {
        int num[]={11,21,12,4,5,6,3,1};
        int sm=Integer.MAX_VALUE;
        int secsm=Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            if(num[i]<sm){
                secsm=sm;
                sm=num[i];
            }
            else if(num[i]<secsm && num[i]>sm){
                secsm=num[i];
            }
        }
        System.out.println(secsm);
    }
    
}
