public class AverageLogic {
    public static double arithmeticAverage(double n) {
        int first = (int) n / 100000;
        int second = (int) n / 10000 - first * 10;
        int third = (int) n / 1000 - (first * 100 + second * 10);
        int fourth = (int) n / 100 - (first * 1000 + second * 100 + third * 10);
        int fifth = (int) n / 10 - (first * 10000 + second * 1000 + third * 100 + fourth * 10);
        int sixth = (int) n - (first * 100000 + second * 10000 + third * 1000 + fourth * 100 + fifth * 10);
        double sum=(double)(first+second+third+fourth+fifth+sixth);
        return sum/6.0;
    }

    public static double geometricAverage(double n) {
        int first = (int) n / 100000;
        int second = (int) n / 10000 - first * 10;
        int third = (int) n / 1000 - (first * 100 + second * 10);
        int fourth = (int) n / 100 - (first * 1000 + second * 100 + third * 10);
        int fifth = (int) n / 10 - (first * 10000 + second * 1000 + third * 100 + fourth * 10);
        int sixth = (int) n - (first * 100000 + second * 10000 + third * 1000 + fourth * 100 + fifth * 10);
        double sum=(double)(first*second*third*fourth*fifth*sixth);
        System.out.println(sum);
        return Math.pow(sum,1/6.0);/*Math.exp(1/6.0*Math.log(sum))*/
    }
}
