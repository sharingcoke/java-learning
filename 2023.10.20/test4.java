import java.util.Scanner;

public class test4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
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
}
