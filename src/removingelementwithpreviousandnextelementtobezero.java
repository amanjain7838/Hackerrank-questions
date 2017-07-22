
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class removingelementwithpreviousandnextelementtobezero {
     
 public static void main(String args[])
 {Scanner z=new Scanner (System.in);
 int t=z.nextInt();
 while(t-->0)
 {int stringsize=z.nextInt();
 ArrayList<Integer> board=new ArrayList<>(); 
 int player=1;
 
 for(int i=0;i<stringsize;i++)
 {board.add(z.nextInt());
if(i>2&&i<stringsize-1)
{if(board.get(i-3)==0 &&board.get(i-1)==0)
 {board.remove(i-2); if(i-1!=0)i--;stringsize--;

 player++;}
 }}
 
 
 if(board.size()<=2)
 {System.out.println("Bob");}
 else{for(int i=1;i<board.size()-1;)
 {if(board.get(i-1)==0 &&board.get(i+1)==0)
 {board.remove(i);
 if(i-1!=0)i--;
 player++;
 }else i++;
 }
 if(player%2==1){System.out.println("Bob");}else System.out.println("Alice");;
  }}}}