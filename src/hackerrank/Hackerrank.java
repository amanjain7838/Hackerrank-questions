package hackerrank;

import java.util.Scanner;

public class Hackerrank
{public static void main(String args[])
{
Scanner z=new Scanner(System.in);
int n=z.nextInt();
int t=z.nextInt();
int[] candy=new int[t];
for(int i=0;i<t;i++)
{candy[i]=z.nextInt();
}    
int total=0,sum=n,diff;
for(int i=0;i<t-1;i++)
{sum=sum-candy[i];
if(sum<5)
{diff=n-sum;
sum=sum+diff;
total=total+diff;}
}

System.out.println(total);
}
}