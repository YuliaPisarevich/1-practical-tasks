public class AverageLogic {
    public static double arithmeticAverage(int num) {
        int num6 = num % 10;
        num /= 10;
        int num5 = num % 10;
        num /= 10;
        int num4 = num % 10;
        num /= 10;
        int num3 = num % 10;
        num /= 10;
        int num2 = num % 10;
        num /= 10;
        int num1 = num % 10;
        double sum = (double) (num1 + num2 + num3 + num4 + num5 + num6);
        return sum / 6.0;
    }

    public static double geometricAverage(int num) {
        int num6 = num % 10;
        num /= 10;
        int num5 = num % 10;
        num /= 10;
        int num4 = num % 10;
        num /= 10;
        int num3 = num % 10;
        num /= 10;
        int num2 = num % 10;
        num /= 10;
        int num1 = num % 10;
        double sum = (double) (num1 * num2 * num3 * num4 * num5 * num6);
        return Math.pow(sum, 1 / 6.0);/*Math.exp(1/6.0*Math.log(sum))*/
    }
}
