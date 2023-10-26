public class tsst1 {
    public static void main(String[] args) {
        int a=100;
        switch (a/10+10)/*switch-case语句的判读条件不能是双精度*/
        {
            case 10:System.out.println("see");
            case 20:System.out.println("see");/*a=20，所以入口在这*/
            case 30:System.out.println("see");break;/*出口是break*/
            case 40:System.out.println("see");

        }
    }
}
