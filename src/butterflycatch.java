import java.util.*;

public class butterflycatch {
    public static void main(String args[])
    {Scanner z=new Scanner(System.in);
    int n=z.nextInt();
    int location_bird=z.nextInt();
    int pos,v,i=0,t=0,t1=0,name = 0,flag=0;
    while(n-->0)
    {pos=z.nextInt();
    v=z.nextInt();
    
    if(i>0 && pos==location_bird)
    {t=0;}
    else if(i>0&&pos>location_bird)
            {t=(pos-location_bird)/v;}
    else if(i>0&&pos<location_bird)
    {t=(location_bird-pos)/v;}
    else 
    {if(pos<location_bird)
        t1=(location_bird-pos)/v;
    else
        t1=(pos-location_bird)/v;}
    if(t==t1)
    {System.out.println(-1);
    flag=1;
    break;}
    
    else if(t<t1)
            {t1=t;
            name=i;
            }
    
    }if(flag==0)
    System.out.println(name);
}}
