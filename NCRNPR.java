import java.util.Scanner;

public class NCRNPR {

    // Calculates factorial of a non-negative number
    private static long factorial(int number) {
        long result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        return result;
    }

    // Calculates nCr (combination)
    private static long calculateNCR(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    // Calculates nPr (permutation)
    private static long calculateNPR(int n, int r) {
        return factorial(n) / factorial(n - r);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        int n = scanner.nextInt();

        System.out.print("Enter value of R: ");
        int r = scanner.nextInt();

        if (n < 0 || r < 0) {
            System.out.println("N and R must be non-negative numbers.");
            scanner.close();
            return;
        }

        if (r > n) {
            System.out.println("R should be less than or equal to N.");
            scanner.close();
            return;
        }

        long ncr = calculateNCR(n, r);
        long npr = calculateNPR(n, r);

        System.out.println("nCr (Combination): " + ncr);
        System.out.println("nPr (Permutation): " + npr);

        scanner.close();
    }
}
