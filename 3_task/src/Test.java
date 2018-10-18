public class Test {
    public static void main(String[] args) {
        double r1 = UserInput.nextDouble();
        double r2 = UserInput.nextDouble();

        if (r2 > r1) {
            r1 = r1 + r2 - (r2 = r1);
        }

        double ringSquare = SquareLogic.SquareRing(r1, r2);
        System.out.println("площадь кольца = " + ringSquare);
    }
}
