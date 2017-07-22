
import java.util.Scanner;

public class sortarraywithdifferenceofone {
    public static void main(String args[])
    {Scanner z=new Scanner(System.in);
    int t=z.nextInt();
    while(t-->0)
    {
        int arraysize=z.nextInt();
        int[] array=new int[arraysize];
        for(int i=0;i<arraysize;i++)
        {array[i]=z.nextInt();
        }
        int temp=0;
        for(int i=0;i<arraysize-1;i++)
        {if(array[i]>array[i+1]&&Math.abs(array[i]-array[i+1])==1)
        {temp=array[i];
        array[i]=array[i+1];
        array[i+1]=temp;
        }
         }
        
        boolean a=true;
        for(int i=0;i<arraysize-1;i++)
        {if(array[i]>array[i+1]&&Math.abs(array[i]-array[i+1])!=1)
        {a=false;break;
        }
        }
        if(a)
        {System.out.println("Yes");
        }
        else 
            System.out.println("No");
        
    }
    
    
    
    }
}
