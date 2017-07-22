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
public class recursionformin {
 static int n;static int t;
    static void min()
 {n--;
 if(n==0)
 {System.out.print("int");
 while(t-->1)
 {System.out.print(")");}
 }
 else 
 {System.out.print("min(int, ");min();}
 
 }
 public static void main(String args[])
 {Scanner z=new Scanner(System.in);
  
     n=z.nextInt();t=n;
     min();
 }
}
