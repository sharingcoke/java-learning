import java.util.*;

/*public class Main {
     public static void main(String[] args){
         System.out.println("* * * * * * * *消费单* * * * * * * *");
         System.out.printf("%-7s %-4s %-8s %-5s\n","购买物品","单价","个数","金额");
         System.out.printf("%-7s %-4s %-8s %-5s\n","T恤      ","￥245","2","￥490");
         System.out.printf("%-7s %-4s %-8s %-5s\n","网球鞋","￥570","1","￥570");
         System.out.printf("%-7s %-4s %-8s %-5s\n","网球拍","￥320","1","￥320");
         System.out.printf("%-7s %-4s %-8s %-5s\n","折扣：","八折"," "," ");
         System.out.printf("%-7s %-4s %-8s %-5s\n","消费总金额"," ","￥1104.0"," ");
         System.out.printf("%-7s %-4s %-8s %-5s\n","实际交费","￥1500"," "," ");
         System.out.printf("%-7s %-4s %-8s %-5s\n","找钱","￥396.0"," "," ");
         System.out.printf("本次购物所获得的积分是：  33\n");
     }
}*//*
public class Main{
    public static void main(String[] args){
        Random r = new Random();
        int a = r.nextInt(9)+1;
        int x;
        Scanner sc =new Scanner(System.in);
        for(int i=1;i<=3;i++){
            System.out.println("请输入你猜的数");
            x= sc.nextInt();
            if(x>a)
                System.out.println("大了");
            else if (x==a) {
                System.out.println("猜对了");
                System.exit(0);
            }
            else {
                System.out.println("小了");
            }
        }
        System.out.println("游戏结束");

    }
}*//*
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你要查询的年份");
        int y= sc.nextInt();
        String result = "";
        if(y%4==0&y%100!=0)
            result="是";
        else if(y%400==0)
            result="是";
        else
            result="不是";
        System.out.println(result);
    }
}*//*
public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int a;
        int max=0;
        int min=101;
        for (int i = 0; i < 10; i++) {
            a=r.nextInt(100);
            System.out.println(a);
            if(a>max)
                max=a;
            if(a<min)
                min=a;
        }
        System.out.println("最大为:"+max+"\n最小为:"+min);
    }
}*/
/*public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("\n");
        }

    }
}*/
