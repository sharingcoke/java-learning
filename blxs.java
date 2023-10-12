import java.util.Scanner;
public class blxs {
    
    public static void main(String[] args) {
        double x;
        Scanner sc = new Scanner(System.in);//构造一个Scanner对象，其传入参数为System.in
        System.out.println("请输入数值");
        x=sc.nextDouble()+0.05;
        int d1=(int)(x*10);
        double d2=d1/10.0;
        System.out.println(d2);

    }
}
