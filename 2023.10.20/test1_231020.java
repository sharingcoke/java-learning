import java.util.Scanner;

public class test1_231020 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);//构造一个Scanner对象，其传入参数为System.in
        System.out.println("请输入你要查询的年龄：");
        String result;
        int age = sc.nextInt();
        if(age>66) {
            result = "老年";
            System.out.println(result);
        }
        else if(age>41)
            System.out.println("中年");
        else if(age>18)
            System.out.println("青年");
        else if (age>7)
            System.out.println("少年");
        else if(age>0)
            System.out.println("幼儿");
        else
            System.out.println("非法输入");
    }
}

