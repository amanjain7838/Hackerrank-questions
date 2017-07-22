
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class noconsecutiveletters {
    public static void main(String args[])
    {Scanner z=new Scanner(System.in);
    String word=z.next();
    word=word.toLowerCase();
            boolean t=false;
    for(int i=0;i<word.length()-1;i++)
    {char a=word.charAt(i);
    char b=word.charAt(i+1);
    if(a==b)
    {System.out.println("NO");t=true;
    break;
    }
    else if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='y')
      {if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u'||b=='y')
      {System.out.println("No");t=true;break;
      }}
    }
    if(t==false)
        System.out.println("Yes");
    
    }
}