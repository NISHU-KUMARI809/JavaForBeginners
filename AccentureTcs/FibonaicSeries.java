package AccentureTcs;
public class FibonaicSeries {
    public static void main(String[] args) {
        int n=10;
        int firstNumb=0;
        int secNumb=1;
        int nextnum;
        for(int i=1;i<=n;i++){
            System.out.print(firstNumb+", ");
            nextnum=firstNumb+secNumb;
            firstNumb=secNumb;
            secNumb=nextnum;
        }
    }
    
}
