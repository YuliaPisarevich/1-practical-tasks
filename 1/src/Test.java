public class Test {
    public static void main(String[] args) {
        double kg = 10;

        double mg = WeightWorker.kgIntoMilligram(kg);
        double gram = WeightWorker.kgIntoGram(kg);
        double tn = WeightWorker.kgIntoTon(kg);

        System.out.println(kg + " кг =" + mg + " мг");
        System.out.println(kg + " кг =" + gram + " г");
        System.out.println(kg + " кг =" + tn + " т");

    }
}
