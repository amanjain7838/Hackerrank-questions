
import java.io.IOException;
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
public class forwardbackward {
        public static int GetJumpCount(int input1,int input2,int[] input3)
    {
	    //Write code here
        int total=0;
        for(int i=0;i<input3.length;i++)
        {int heigthreach=input1,step=1;
        while(heigthreach<input3[i])
        {heigthreach=heigthreach+input1-input2;
        step++;
        }
total=total+step;        
        }
        return total;
    }
        
        
        public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        int output = 0;
        int ip1 = Integer.parseInt(in.nextLine().trim());
        int ip2 = Integer.parseInt(in.nextLine().trim());
        int ip3_size = 0;
        ip3_size = Integer.parseInt(in.nextLine().trim());
        int[] ip3 = new int[ip3_size];
        int ip3_item;
        for(int ip3_i = 0; ip3_i < ip3_size; ip3_i++) {
            ip3_item = Integer.parseInt(in.nextLine().trim());
            ip3[ip3_i] = ip3_item;
        }
        output = GetJumpCount(ip1,ip2,ip3);
        System.out.println(String.valueOf(output));
    }

}
