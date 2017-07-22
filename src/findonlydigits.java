
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
public class findonlydigits {
 public static void main(String args[])   
 {Scanner z=new Scanner(System.in);
 String ab=z.next();
if(ab.matches("[0-9]+"))
{System.out.println("String contains only numbers");}
 }
}
