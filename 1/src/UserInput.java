import java.util.Scanner;
public class UserInput {
    public static double inputMass(){
        System.out.println("Введите массу в кг");
        Scanner in = new Scanner(System.in);
        double kg = in.nextDouble();
        return kg;
    }
}
