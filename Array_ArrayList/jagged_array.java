


package Array_ArrayList;

import java.util.Scanner;
public class jagged_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int[][] arr = new int[rows][];
        System.out.println(rows);

        for (int i = 0; i < rows; i++) {
            int cols = sc.nextInt();
            arr[i] = new int[cols];
            System.out.print(cols + " ");
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}




