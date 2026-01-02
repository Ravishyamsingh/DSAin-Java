package Array_ArrayList;

public class dimondpatternwithletter {
    public static void main(String[] args) {
        char[] ch={'s','e','f','h','k','i','o'};
        int num=ch.length;

        for(int i=0;i<num;i++){
            for(int j=0;j<num-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(ch[j]+" ");
            }
            System.out.println();

        }
        for(int i=num-2;i>=0;i--){
            for(int j=0;j<num-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(ch[j]+" ");
            }
            System.out.println();
        }
    }
}
