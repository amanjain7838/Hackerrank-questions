
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
public class stringmatchingwithrightshift {
    public static void main (String[] args) throws java.lang.Exception 
    { String input = "cAda",input2="cAda";
    int count=0;
    String line ="AbrAcadAbRa";
         for(int i = 0; i < input.length(); i++)
            { input = Rshift(input); 
      Pattern r = Pattern.compile(input);
     Matcher m = r.matcher(line);
      
      while(m.find()) {
         count++;}
            } 
         System.out.println("number "+count);    
    }
    
    public static String Rshift(String s) 
    { return s.charAt(s.length()-1)+s.substring(0, s.length()-1); }
    public static String Lshift(String s) 
    { return s.substring(1, s.length())+s.charAt(0); }

}
