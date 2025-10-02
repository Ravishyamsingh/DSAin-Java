




package Array_ArrayList;

import java.util.Arrays;

public class PassinginFunction {
    public static void main(String[] args) {
        int arr[]={3,4,5,12};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
         System.out.println(Arrays.toString(arr));



    }
    static void change(int[] arr){
        arr[0]=99;
    }
}



