/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
import java.util.*;
        
import java.io.*;
public class read {
    public static void main (String args[])
    {char[] c=new char[128];
    File file=new File("C:\\Users\\Admin\\Documents\\javafile.txt");
    try 
    {Scanner x=new Scanner (System.in);
    FileReader fr=new FileReader("C:\\Users\\Admin\\Documents\\javafile.txt");
    FileWriter fw=new FileWriter("C:\\Users\\Admin\\Documents\\javafile2.txt");
    int i=0;
   System.out.println("entere encryption key ");
   int key=x.nextInt();
    while((i=fr.read())!=-1)
    {
    fw.write(i+key);
    }
    
    fr.close();
    fw.close();
    }
    
    
        
    
    catch(IOException e)
    {System.out.print(e);
    }}}
        
