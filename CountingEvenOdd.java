

// JAVA program to count number of even
// and odd elements in an array
import java.util.Scanner;

class count {

    static void CountingEvenOdd(int arr[], int arr_size) {
        int even_count = 0;
        int odd_count = 0;
        

        // loop to read all the values in the array
        for (int i = 0; i < arr_size; i++) {
            // checking if a number is completely divisible by 2
            if ((arr[i] & 1) == 1)
                odd_count++;
            else
                even_count++;
        }

        

        System.out.println("Number of even elements = " + even_count
                + "\nNumber of odd elements = " + odd_count);
    }

    // Driver Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for the size of the array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        // Prompt user to input elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Function Call
        CountingEvenOdd(arr, n);
    }
}
