







import java.util.Scanner;

public class CGPACalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int subjects = scanner.nextInt();

        double totalGradePoints = 0;

        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter grade point for subject " + i + ": ");
            totalGradePoints += scanner.nextDouble();
        }

        double cgpa = totalGradePoints / subjects;

        System.out.println("CGPA: " + cgpa);

        scanner.close();
    }
}


