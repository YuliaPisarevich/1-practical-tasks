public class IncreaseNumberLogic {

    public static boolean increase(double n){
        int first = (int) n/1000;
        int second = (int) n/100 - first*10;
        int third = (int) n/10 - (first*100 + second*10);
        int fourth = (int) n - (first*1000+second*100+third*10);
        return first<second && second<third && third<fourth;
    }
    public static boolean decrease(double n){
        int first = (int) n/1000;
        int second = (int) n/100 - first*10;
        int third = (int) n/10 - (first*100 + second*10);
        int fourth = (int) n - (first*1000+second*100+third*10);
        return first>second && second>third && third>fourth;
    }
}
