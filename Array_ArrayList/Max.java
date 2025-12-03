package Array_ArrayList;
import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int[] arr={1, 3, 23, 9, 18};
        System.out.println("Enter number of element: ");

        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter"+n+"element: ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter start index: ");
        int start =sc.nextInt();
        System.out.println("Enter end index: ");
        int end=sc.nextInt();


        System.out.println(max(arr));
        System.out.println(maxRange(arr,start,end));
    }

    static int maxRange(int[] arr, int start, int end) {

        int maxVal = arr[start];

        for (int i = start; i <= end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }

        }
        return maxVal;
    }
    //Imagine that array is not empty
    static int max(int[] arr){

        int maxVal=arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }

        }
        return maxVal;
    }
}





