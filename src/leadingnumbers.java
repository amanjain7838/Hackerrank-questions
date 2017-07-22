import java.util.*;
import java.io.*;
public class leadingnumbers
{
  public static void  main(String args[]) 
  {
Scanner s=new Scanner(System.in);
int t=s.nextInt();
while(t-->0)
{
  String k=s.next();
  int i=0;
  for( i=0;i<k.length()-1;i++)
  {
    if(k.charAt(i)>k.charAt(i+1))
      break;
  }
//  String check="";
  if(i==k.length()-1)
   System.out.println(k);
   else{
 while(i>0&&k.charAt(i)==k.charAt(i-1))
 i--;
  String check="";
  for(int j=0;j<k.length();j++)
  {
    if(j<i)
      check+=k.charAt(j);
      else{
        if(i==j)
        check+=(char)(k.charAt(j)-1);
        else
        check+='9';
			}
  }
    if(check.charAt(0)=='0') check=check.substring(1);
    System.out.println(check);
}
}
  }
}