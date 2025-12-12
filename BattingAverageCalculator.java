
import java.util.*;
import java.util.*;
import java.util.Scanner;

public class BattingAverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Enter total runs scored: ");
        int runs = scanner.nextInt();

        //
        System.out.print("Enter total innings played: ");
        int innings = scanner.nextInt();


        
        
        System.out.print("Enter number of not out innings: ");
        int notOut = scanner.nextInt();

        int dismissals = innings - notOut;

        double battingAverage = (dismissals == 0) ? runs : (double) runs / dismissals;

        System.out.println("Batting Average: " + battingAverage);

        scanner.close();
    }
}




