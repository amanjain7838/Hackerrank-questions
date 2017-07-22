/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Admin
 */
public class regexinjava {
    public static void main(String args[])
    {Scanner z=new Scanner(System.in);
    Pattern p=Pattern.compile("[sde]");
    Matcher m=p.matcher(z.nextLine());
    if(m.matches())
    {System.out.print("matched");}
    }
}
