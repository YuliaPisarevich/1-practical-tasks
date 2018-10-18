public class Test {
    public static void main(String [] args){

        int num = UserInput.nextInt();
        double arithmetic = AverageLogic.arithmeticAverage(num);
        double geometric=AverageLogic.geometricAverage(num);

        System.out.println("Среднее арифметическое  " + num + " = "+arithmetic);
        System.out.println("Среднее геометрические числа " + num + " = "+ geometric);

    }
}
