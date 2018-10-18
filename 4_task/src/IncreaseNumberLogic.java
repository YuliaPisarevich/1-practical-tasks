public class IncreaseNumberLogic {

    public static boolean isIncrease(int num) {
        int num4 = num % 10;
        num /= 10;
        int num3 = num % 10;
        num /= 10;
        int num2 = num % 10;
        num /= 10;
        int num1 = num % 10;

        return num1 < num2 && num2 < num3 && num3 < num4;
    }

    public static boolean isDecrease(int num) {
        int num4 = num % 10;
        num /= 10;
        int num3 = num % 10;
        num /= 10;
        int num2 = num % 10;
        num /= 10;
        int num1 = num % 10;

        return num1 > num2 && num2 > num3 && num3 > num4;
    }
}
