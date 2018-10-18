public class Test {
    public static void main(String[] args) {
        int a = UserInput.nextInt();
        int b = UserInput.nextInt();

        a = a + b - (b = a);

        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
}
