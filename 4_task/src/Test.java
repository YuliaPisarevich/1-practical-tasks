public class Test {
    public static void main(String[] args) {
        int num = UserInput.nextInt();

        boolean increase = IncreaseNumberLogic.isIncrease(num);
        boolean decrease = IncreaseNumberLogic.isDecrease(num);

        System.out.println("Последовательность цифр " + num + " является возрастающей: " + increase);
        System.out.println("Последовательность цифр " + num + " является убывающей: " + decrease);

    }
}
