
import java.util.Scanner;

public class primefactors {
 public static int sum(int a)
 {int sum=0,n;
     while(a>0)
     {n=a%10;
     sum=sum+n;
     a=a/10;
     }
     return sum;
 }
    public static void main(String args[])
 {Scanner z=new Scanner(System.in);
 int t=z.nextInt();
 while(t-->0)
 {int l=z.nextInt();
 int u=z.nextInt();
 for(int i=l;i<=u;i++)
 {if(i==2||i==3||i==5||i==7||i==11)
 {System.out.println(i);}
     else
 {if(i%2!=0&&i%5!=0&&i!=0&&i!=1&&i%11!=0)
 {int asum=sum(i);
 if(asum%3!=0)
 {int last=i%10;
 int xy=i;
 int lastsec=(xy/10);
 if((lastsec-2*last)%7!=0)
 
 {System.out.println(i);}
 }}
 }
 }
 if(t>=1)
 System.out.println("\n");
 }
 }
}
