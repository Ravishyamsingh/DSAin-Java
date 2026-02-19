import java.util.*;
public class variableLengthArgument {
    public static void main(String[] args) {
        fun(2,4,5,6,10,15,18,21,26);
        multiple(5,10,"Ravi","Shyam","Singh","Sri","Krishna");
    }

    static void multiple(int a ,int b, String ...v){
        System.out.println("a = "+a+","+" b = "+b+", Name: "+Arrays.toString(v));

    }



    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
