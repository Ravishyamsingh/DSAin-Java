package Array_ArrayList;
import java.util.Scanner;

public class MultiDimensional {
    public static void main(String[] args) {
        /*
            1 2 3
            4 5 6
            7 8 9
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows: ");
        int rows=sc.nextInt();
        System.out.println("Enter Columns: ");
        int col=sc.nextInt();
        int[][] arr=new int[rows][col];//It will give no of row only "3"
        System.out.println(arr.length);
//        int [][] arr={
//                {1, 2, 3},        //{1, 2, 3}, //this is also posible/              {4, 5, 6,},       {4, 5},
//                {7, 8, 9},
//                {6, 7, 8, 9}
//
////
//        };
        for ( rows = 0; rows < arr.length; rows++) {
            for ( col = 0; col < arr[rows].length; col++) {
                arr[rows][col]=sc.nextInt();
                System.out.print(arr[rows][col]+" ");
                
            }
            System.out.println();

        }

    }
}



