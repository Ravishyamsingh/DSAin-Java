
package Array_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Example {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        ArrayList<Integer> list=new ArrayList<>();
//        list.add(12);
//        list.add(20);
//        list.add(30);
//        list.add(42);
//        list.add(654);
//
//        System.out.println(list);
//        list.set(0,99);
//        list.remove(2);
//        System.out.println(list.contains(654));//true
//        System.out.println(list.contains(534));//false
//        System.out.println(list);
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());


        }
        //get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println((list.get(i))); //pass index here list[index] syntax will not work here
        }
        System.out.print(list);

    }

}

