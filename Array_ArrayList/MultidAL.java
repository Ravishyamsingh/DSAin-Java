package Array_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MultidAL {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list =new ArrayList<>();

        System.out.println(list);
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());


            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
    }
}


