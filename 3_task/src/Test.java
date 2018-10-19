public class Test {
    public static void main(String[] args) {
        double r1 = UserInput.nextDouble();
        double r2 = UserInput.nextDouble();

        double ringSquare = SquareLogic.SquareRing(r1, r2);
        System.out.println("площадь кольца = " + ringSquare);
    }
}
