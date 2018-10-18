public class BackwardNumberLogic {
    public static int backwardNumber(int num) {
        int num7 = num % 10;
        num /= 10;
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

        num1 = num1 + num7 - (num7 = num1);
        num2 = num2 + num6 - (num6 = num2);
        num3 = num3 + num5 - (num5 = num3);

        int result = num1 * 1_000_000 + num2 * 100_000 + num3 * 10_000 + num4 * 1000 + num5 * 100 + num6 * 10 + num7;

        return result;
    }

}
