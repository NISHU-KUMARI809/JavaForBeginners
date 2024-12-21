package AccentureTcs;
public class FibonaicSeries1 {
    public static void main(String[] args) {
        int num=10;
        int first=0;
        int sec=1;
        int nextNum;
        for(int i=1;i<=num;i++){
            System.out.print(first+" ");
            nextNum=first+sec;
            first=sec;
            sec=nextNum;
        }

        
    }
    
}
