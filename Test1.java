import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            /*int min=sc.nextInt();
            int max=sc.nextInt();
            int sum=0;
            for(int i=min;i<=max;i++){
                if(i%11==0)
                    sum+=i;
            }
            System.out.println(sum);
        }*//*
        int n = 0;
        int sum = 0;
        while (sum < 5678) {
            sum = n * n;
            n++;
        }
        System.out.println(sum);*//*
        int a= sc.nextInt();
        int b= sc.nextInt();
        int i=b;
        while(a%b!=0){
            i=a%b;
            a=b;
            b=i;
        }
        System.out.println(i);*//*
        int min=10000;
        int max=99999;
        int sum=0;
        for(int i=min;i<=max;i++) {
            if (i % 10 == 6 & i % 3 == 0)
                sum++;
        }
        System.out.println(sum);*//*
        double sum=1;
        for(int i=3;i<=99;i+=2){
            sum-=1.0/i;
        }
        System.out.println(sum);*/
        int score = 0;
        int count = 0;
        int min =2^31-1;
        int max =-2^31+1;
        while (score != -1) {
            score = sc.nextInt();
            if (score != -1) {
                count++;
                if (score <= min) min = score;
                if (score >= max) max = score;
            }
        }
        System.out.println("人数是"+count);
        System.out.println("最小"+min);
        System.out.println("最大"+max);
    }
}
