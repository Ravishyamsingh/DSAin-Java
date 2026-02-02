import java.util.Scanner;

public class PerimeterEquilateralTriangle {

    // Calculates the perimeter of an equilateral triangle
    private static double calculatePerimeter(double sideLength) {
        return 3 * sideLength;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side length of the equilateral triangle: ");
        double sideLength = scanner.nextDouble();

        if (sideLength <= 0) {
            System.out.println("Side length must be greater than zero.");
            scanner.close();
            return;
        }

        double perimeter = calculatePerimeter(sideLength);

        System.out.println("Side Length : " + sideLength);
        System.out.println("Perimeter of Equilateral Triangle : " + perimeter);

        scanner.close();
    }
}
