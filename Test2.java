public class Test2 {
    public static void main(String[] args) {
        double s;
        for(int i=1;i<=10;i++){
            s=i*i*3.1415926535;
            System.out.println(s);
            if(s>100)
                break;
        }
    }

}
