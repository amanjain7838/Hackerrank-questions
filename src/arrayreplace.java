
import java.util.Scanner;


public class arrayreplace {
public static void main(String args[])
{Scanner z=new Scanner(System.in);
int asize=z.nextInt();
int[] array=new int[asize];
int t=z.nextInt();
for(int i=0;i<asize;i++)
    array[i]=z.nextInt();
while(t-->0)
{int temp=z.nextInt();
if(temp==1)
{//code
    int l=z.nextInt()-1,r=z.nextInt()-1,k=z.nextInt();
    int sum=0,ex = 0;
        {for(int i=l;i<=r;i++)
            {if(i==l)
                {int tol;if(i-k<0){ tol=0;}else tol=i-k;
                    for(int h=tol;h<=l;h++)
                    {sum=sum+array[h];System.out.println(sum);}
                }
            else
                {//if((i-k-1)>0)
               // { ex=sum+array[i]-array[i-k-1];
                //else
                    ex=sum+array[i];               System.out.println(ex+" "+array[i]+" "+sum);

                }
            sum=sum+ex;
            }System.out.println(sum);
        }}
else 
{int tem=z.nextInt(),val=z.nextInt();
    array[tem]=val;
}}}}

