import java.util.Scanner;

public class test2_231020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入你想计算的数");
        double a = sc.nextDouble();
        double result;
        if (a <= 0) {
            result = a * a + 1;
        } else if (a <= 10) {
            result = 2 * a + 10;
        } else {
            result = 7 * a - 15;
        }
        System.out.println(result);
    }
}
