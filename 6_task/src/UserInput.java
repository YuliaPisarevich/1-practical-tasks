import java.util.Scanner;

public class UserInput {
    public static int nextInt() {
        System.out.println("Введите семизначное число");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        return num;
    }
}
