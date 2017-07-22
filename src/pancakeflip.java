
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
public class pancakeflip {
    public static void main(String args[])
    {Scanner z=new Scanner(System.in);
    int t=z.nextInt();
    while(t-->0)
    {String plus=z.next();
    int flipsize=z.nextInt(),ans=0;
    for(int i=0;i+flipsize<=plus.length();i++)
    {if(plus.charAt(i)=='-')
        {ans++;
        for(int j=0;j<flipsize;j++)
        {if(plus.charAt(i+j)=='-')
        {plus[i+j]='+';
        }
        else plus[i+j]='-';
        }
        }
    }
    if(plus.contains("-"))
    {System.out.println("impossible");}
    else
    {System.out.println(ans);}
        
    }
    
    }    
    }
            
