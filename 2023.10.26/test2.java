import java.util.Scanner;

public class test2 {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("请输入月份");
       int m=sc.nextInt();
        switch (m) {
            case 1 -> System.out.println(m + "月");
            case 2 -> System.out.println(m + "月");
            case 3 -> System.out.println(m + "月");
            case 4 -> System.out.println(m + "月");
            case 5 -> System.out.println(m + "月");
            case 6 -> System.out.println(m + "月");
            case 7 -> System.out.println(m + "月");
            case 8 -> System.out.println(m + "月");
            case 9 -> System.out.println(m + "月");
            case 10 -> System.out.println(m + "月");
            case 11 -> System.out.println(m + "月");
            case 12 -> System.out.println(m + "月");
        }
    }
}
