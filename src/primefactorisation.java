
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class primefactorisation {
    public static int call(int n)
    { int flag=0; while (n%2==0)
        {n /= 2;flag++;
        }
            for (int i = 3; i <= Math.sqrt(n); i+= 2)
        {while (n%i == 0)
            {n /= i;flag++;
            }
        }if(n>2)flag++;
        
        if(flag !=2)
        {return 1;}else if(flag==2)
        {System.out.println("YES");return 0;}
        return 0;  
    }
    public static void main(String args[])
    {Scanner z=new Scanner (System.in);
    int arraysize=z.nextInt();
    int[] array=new int[arraysize];
    int t=z.nextInt();
    for(int i=0;i<arraysize;i++)
        {array[i]=z.nextInt();}
    while(t-->0)
        {int temp=z.nextInt();int flag=0,extra=0;
        for(int i=0;i<arraysize;i++)
            {if(temp%array[i]==0)
                {extra=call(temp/array[i]);temp=temp/array[i];
                if(extra==1){i--;extra=0;flag=0;}
                else {flag=1;break;}
                }}
        if(flag==0)System.out.println("NO");
        }
    }
}
