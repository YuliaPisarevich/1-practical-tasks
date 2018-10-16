public class BackwardNumberLogic {
    public static double backwardNumber(double n) {
        int first = (int) n / 1000000;
        int second = (int) n / 100000 - first * 10;
        int third = (int) n / 10000 - (first * 100 + second * 10);
        int fourth = (int) n / 1000 - (first * 1000 + second * 100 + third * 10);
        int fifth = (int) n / 100 - (first * 10000 + second * 1000 + third * 100 + fourth * 10);
        int sixth = (int) n / 10 - (first * 100000 + second * 10000 + third * 1000 + fourth * 100 + fifth * 10);
        int seventh = (int) n - (first * 1000000 + second * 100000 + third * 10000 + fourth * 1000 + fifth * 100 + sixth * 10);

        int a = first;
        int b = second;
        int c = third;

        first = seventh;
        second = sixth;
        third = fifth;
        fifth = c;
        sixth = b;
        seventh = a;
        return first * 1000000 + second * 100000 + third * 10000 + fourth * 1000 + fifth * 100 + sixth * 10 + seventh;
    }

}
