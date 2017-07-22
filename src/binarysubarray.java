
import java.util.Scanner;

public class binarysubarray {
    public static void main(String args[])
    {Scanner z=new Scanner(System.in);
     int t=z.nextInt();
     int[] array=new int[t];
     int temp=0,di=0,pos=0,smax=0,max=0,prevmax=0,pcount = 0;
     for(int i=0;i<t;i++)
     {temp=z.nextInt();
     if(temp==1){
     array[di]++;
     if(max<array[di])
     {
         max=array[di];
     pos=di;}
     else if(smax<array[di])
     {smax=array[di];}
     }
     else if(temp==0)
     {if(di<t-2)
         di=di+2;
     else di++;}
     
     
     }
     System.out.println(max+smax);
    }
}
