
import java.util.*;
import java.io.*;
public class HelloWorld{

     public static void main(String []args){
       Scanner z=new Scanner(System.in);
       int a=z.nextInt();
        int array[]=new int[101];
        Set<Integer> array1=new HashSet<>(a);
        for(int i=0;i<a;i++)
        {
           int temp=z.nextInt();
           array[temp]+=1;
           array1.add(temp);
        }
        int sale=0;
        for (int var : array1) 
        { 
            sale+=array[var]/2;
        }
        System.out.println(sale);
     }
}
