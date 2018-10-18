public class Test {
    public static void main(String[] args) {
        double a = UserInput.inputDouble();
        double b = UserInput.inputDouble();;
        double c = UserInput.inputDouble();;

        boolean result = CompareLogic.compareThree(a,b,c);

        System.out.println(result);


    }
}
