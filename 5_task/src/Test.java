public class Test {
    public static void main(String [] args){

        double n = 123456;
        double arithmetic = AverageLogic.arithmeticAverage(n);
        double geometric=AverageLogic.geometricAverage(n);

        System.out.println("Среднее арифметическое  " + n + " = "+arithmetic);
        System.out.println("Среднее геометрические числа " + n + " = "+ geometric);

    }
}
