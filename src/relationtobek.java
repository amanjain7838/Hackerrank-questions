
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class relationtobek {
    public static void main(String args[])
    {Scanner z=new Scanner(System.in);
    int t=z.nextInt();
    while(t-->0)
    {int limit=z.nextInt();
    int k=z.nextInt();
    ArrayList<Integer> A=new ArrayList<>();
    
    ArrayList<Integer> B=new ArrayList<>();
    for(int i=0;i<limit;i++)
    {A.add(z.nextInt());}
    for(int i=0;i<limit;i++)
    {B.add(z.nextInt());} 
   Collections.sort(A);
Collections.sort(B,Collections.reverseOrder());

int flag=0,j=limit-1;
    for(int i=0;i<limit;i++)
    {if(A.get(i)+B.get(i)<k)
    {flag=1;System.out.println("NO");break;}
    
    }
    if(flag==0)
    {System.out.println("YES");}
    }
    }
}
