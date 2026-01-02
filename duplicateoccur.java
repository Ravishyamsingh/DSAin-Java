package Array_ArrayList;
import java.util.*;
public class duplicateoccur {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int count=1;
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='0') continue;
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){

                    count++;
                    ch[j]='0';
                }
            }
            if(count>1){
                if(ch[i]==' ')
                    System.out.println("space :"+ count);
                else
                    System.out.println(ch[i]+"  :  "+count);
            }
        }

    }
}
