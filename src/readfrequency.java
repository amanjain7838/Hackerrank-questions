/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */import java.util.*;
import java.io.*;
public class readfrequency {
    public static void main (String args[])
    {char[] c=new char[128];
    File file=new File("C:\\Users\\Admin\\Documents\\javafile.txt");
    try 
    {Scanner x=new Scanner (System.in);
        int [] arr=new int [256];
        int si=0;
    FileReader fr=new FileReader("C:\\Users\\Admin\\Documents\\javafile.txt");
    while((si=fr.read())!=-1)
    {
    arr[(char)si]++;
    }
   System.out.println("eneter char ti find frequency");
   String ele=x.nextLine();
    for(int k=0;k<arr.length;k++)
    {if((char)k>0)
        {
            if(((char)k)==ele.charAt(0))
                System.out.println((char)k+"== "+arr[k]);
        }
    fr.close();
        }
    
    
   
    }
    
    
        
    
    catch(IOException e)
    {System.out.print(e);
    }}}
        
