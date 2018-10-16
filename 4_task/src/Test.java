public class Test {
    public static void main(String [] args){
        double n = 3210;
        boolean increase = IncreaseNumberLogic.increase(n);
        boolean decrease = IncreaseNumberLogic.decrease(n);

        System.out.println("Возрастающая последовательность: "+increase);
        System.out.println("Убывающая последовательность: "+decrease);

    }
}
