package Array_ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class basic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Array of primitive
        int [] arr=new int[7];
//        int[] arr=new int[5];
//        arr[0]=1;
//        arr[1]=12;
//        arr[2]=13;
//        arr[3]=12;
//        arr[4]=51;
        //System.out.println(arr[3]=9);
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=sc.nextInt();
//
//
//        }for (int i = 0; i < arr.length; i++) {
//
//            System.out.print(arr[i] + " ");
//        }
        // Array of object
        String[] str=new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i]=sc.next();
        }
        //srt[1]="ravi";
        System.out.println(Arrays.toString(str));
        str[1]="ravi";
        System.out.println(Arrays.toString(str));
    }
}


