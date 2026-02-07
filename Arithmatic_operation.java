import java.util.Scanner;

public class ArithmeticOperationLongWay {

    public static void main(String[] args) {

        // Step 1: Create Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Step 2: Ask and read first number
        System.out.println("Enter first number:");
        int number1 = scanner.nextInt();

        // Step 3: Ask and read second number
        System.out.println("Enter second number:");
        int number2 = scanner.nextInt();

        // Step 4: Ask for operator
        System.out.println("Enter operator (+, -, *, /):");
        char operator = scanner.next().charAt(0);

        // Step 5: Perform operation using if-else
        if (operator == '+') {

            int result = number1 + number2;
            System.out.println("Addition result: " + result);

        } 
        else if (operator == '-') {

            int result = number1 - number2;
            System.out.println("Subtraction result: " + result);

        } 
        else if (operator == '*') {

            int result = number1 * number2;
            System.out.println("Multiplication result: " + result);

        } 
        else if (operator == '/') {

            // Step 6: Check division by zero
            if (number2 != 0) {
                int result = number1 / number2;
                System.out.println("Division result: " + result);
            } else {
                System.out.println("Error: Division by zero is not allowed");
            }

        } 
        else {
            // Step 7: Invalid operator
            System.out.println("Invalid operator entered");
        }

        // Step 8: Close scanner
        scanner.close();
    }
}
