


import java.util.Scanner;

public class Loop  {
    public static void main(String[] args) {

        /*
        for (initialisation; condition;increment/decrement){
              //body
        }
         */


        //Q: Print number from 1 to 5
//        for(int num =1;num<=5;num+=1){
//            System.out.println(num);
//        }



                /*
        for (initialisation; condition;increment/decrement){
              //body
        }
         */


        //Q: Print number from 1 to 5
//        for(int num =1;num<=5;num+=1){
//            System.out.println(num);
//        }

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//
//        for(int num=1;num<=n;num++){
//            System.out.print("The number is"+num);
//        }

        /*
         while loop

         syntax:
         while(condition){
         //body
         */
//        for (int num=1;num<=5;num +=2){
//            System.out.println(num);
//        }
//        int num=1;
//        while(num <= n){
//            System.out.println(num);
//            num +=1;
//        }

        /*
        //do while

        do{
        }while(condition);
         */

       // int n=1;
        do{      // It will execute atlaest once
            System.out.println(n);
            n++;

        }while(n<=5);

    }
}
