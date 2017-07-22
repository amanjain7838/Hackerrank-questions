
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
public class duplicatecharacters {
    public static void main(String args[])
    {Scanner z=new Scanner(System.in);
    String ab=z.next();
    int[] abc=new int[256];
    for(int i=0;i<ab.length();i++)
    {abc[ab.charAt(i)]++;}
    for(int i=0;i<abc.length;i++)
    {if(abc[i]>1)
    {System.out.println((char)i);}}
    
    
    }
}
