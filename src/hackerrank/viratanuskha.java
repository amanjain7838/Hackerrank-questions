/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class viratanuskha {
    public static void main(String args[])
    {Scanner z=new Scanner(System.in);
    int n=z.nextInt();
    int m=z.nextInt();
    int[][] array=new int[n][m];
for(int i=0;i<n;i++)
{for(int j=0;j<m;j++)
{array[i][j]=z.nextInt();

}
}int min=array[0][0],temp = 0;
for(int i=0;i<n;i++)
{min=array[i][0];

    for(int j=0;j<m;j++)
{
if(min>array[i][j])
{min=array[i][j];
}
        
        

}
if(temp>min&&i!=0)
{temp=min;
}else temp=min;
}
System.out.print(temp);

    }
}
