

import java.util.*;
import java.util.Scanner;

public class Switch_main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter fruit name: ");
        String fruit= in.next();

//        if ( fruit.equals("mango")){
//            System.out.println("king of fruit ");
//        }
//
//        if (fruit.equals("apple")){
//            System.out.println("A sweet red fruit");
//        }

        //Switch case:
        switch (fruit){
            case "mango":
                System.out.println("King of fruit");
                break;
            case "Apple":
                System.out.println("A sweet red fruit");
                break;
            case "Orange":
                System.out.println("Round fruit");
                break;
            case "Grapes":
                System.out.println("Small fruit");
                break; //if breaks is not provided then it will execute all cases
            default:
                System.out.println("Please enter a valid fruit ");
        }
    }
}
