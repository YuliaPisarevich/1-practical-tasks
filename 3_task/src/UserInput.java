import java.util.Scanner;

public class UserInput {
    public static double nextDouble() {
        System.out.println("Введите радиус");
        Scanner in = new Scanner(System.in);
        double num = in.nextDouble();
        return num;
    }
}
