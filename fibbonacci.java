//public class fibbonacci {
//    public static void main(String[] args) {
//        int num=5;
//        int a=0;
//        int fibbo=1;
//        System.out.println(a);
//        for(int i=2;i<=num;i++){
//
//            System.out.println(fibbo);
//            fibbo=fibbo+a;
//            a=fibbo-a;
//        }
//    }
//}
public class fibbonacci {
    public static void main(String[] args) {
        int num = 5;
        int a = 0;
        int fibbo;
        int b = 1;

        for (int i = 1; i <= num; i++) {
            fibbo = a;
            System.out.println(fibbo);
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
