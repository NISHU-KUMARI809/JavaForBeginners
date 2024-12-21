package AccentureTcs;
public class PrimeFactor {
    public static void main(String[] args) {
        int num=228;
        int temp,i=2;
        temp=num;
        while(temp>1){
            if(temp%i==0){
                System.out.print(i+" ");
                temp=temp/i;
            }
            else{
                i++;
            }
        }
    }
    
}
