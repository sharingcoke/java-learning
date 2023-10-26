import java.util.Scanner;

public class test6 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int y= sc.nextInt();
        int m= sc.nextInt();
        int d= sc.nextInt();
        int x=0;
        switch (m){
            case 1:x=d;break;
            case 2:x=(m-1)*30+1+d;break;
            case 3:x=(m-1)*30-1+d;break;
            case 4:x=(m-1)*30+d;break;
            case 5:x=(m-1)*30+d;break;
            case 6:x=(m-1)*30+1+d;break;
            case 7:x=(m-1)*30+1+d;break;
            case 8:x=(m-1)*30+2+d;break;
            case 9:x=(m-1)*30+3+d;break;
            case 10:x=(m-1)*30+3+d;break;
            case 11:x=(m-1)*30+4+d;break;
            case 12:x=(m-1)*30+4+d;break;
        }
        if((y%4==0&y%100!=0)|((y%400==0)))
            if(m>2) x=x+1;
        System.out.println("今年已经过去"+x+"天");
    }
}
