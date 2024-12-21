package AccentureTcs;
/*
bob goes to super market to buy candies represented by array A his mother gave him money M , 
there is offer in super market if the price of candy is a multiple of 5 , he can buy it without spending any money 
otherwise he will spend money 
example: n=5 (let 5 be the differnt types of  candies )
[5,15,20,25,8] represents the price of each type of candies 
he has money =16 rs
output would be: 5 meand he can buy all the 5  types of candies 
 */

public class CandyBuy {
    public static void main(String[] args) {
        int n=6;
        int arr[]={5,15,20,25,8,34};
        int mny=50;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%5==0){
                count++;
            }
            else if(mny>=arr[i]){
                count++;
                mny=mny-arr[i];
            }
        }
        System.out.println(count);
    }
    
}
