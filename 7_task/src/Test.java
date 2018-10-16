public class Test {
    public static void main(String[] args){
        int a = 2;
        int b = 5;
        a=a+b-(b=a);

        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
