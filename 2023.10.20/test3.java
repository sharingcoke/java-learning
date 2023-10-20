import java.util.Scanner;

public class test3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三角形的三边");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        String result = "";
        if((a+b)>c&(a-b)<c){
            if(a==b&b==c)
                result="等边";
            else if (a==b|b==c|a==c){
                if(a*a+b*b==c*c|b*b+c*c==a*a|a*a+c*c==b*b)
                    result="等腰直角";
                else
                    result="等腰";
            }
            else if(a*a+b*b==c*c|b*b+c*c==a*a|a*a+c*c==b*b)
                result="直角";
            else
                result="普通";
        }
        else
            result="不是三角形";
        System.out.println(result);

    }
}
