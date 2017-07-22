
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;


public class reversearraylist {
    public static void main(String args[])
    {Scanner z=new Scanner(System.in);
    ArrayList<Integer> A=new ArrayList<>();
    A.add(1);
     A.add(3);
      A.add(9);
       A.add(8);
       System.out.println(A);
       
       Collections.sort(A, new Comparator<Integer>() {
           @Override
           public int compare(Integer n1, Integer n2) {
               return n2-n1;
           }
       });
       System.out.println(A);
       
       String[] strArr = {"kamal", "akash", "zahir"};
       Arrays.sort(strArr, new Comparator<String>() {
           @Override
           public int compare(String s1, String s2) {
               return s1.compareTo(s2);
           }
       });
       for(String s : strArr)
           System.out.println(s);
       
    }
}
