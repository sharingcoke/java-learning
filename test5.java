public class test5 {
    /*public static void main(String[] args){
        double x=8;
        int i=0;
        do{
            x=x*1.25;
            i++;
        }while (x<=20);
        i=i+2006;
        System.out.println("在"+i);

    }*/
    public static void main(String[] args){
        int sum=0;
        int shu=0;
        for(int i=2059;i<=30857;i++) {
            if (i % 7 == 0) {
                sum += i;
                shu++;
            }
        }
        System.out.println(shu);
        System.out.println(sum);

    }
}
