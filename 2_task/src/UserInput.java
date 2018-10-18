import java.util.Scanner;

public class UserInput {
    public static double inputDouble(){
        System.out.println("Введите число");
        Scanner in = new Scanner(System.in);
        double num = in.nextDouble();
        return num;
    }
}
