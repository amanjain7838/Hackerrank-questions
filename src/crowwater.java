import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class crowwater
{
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        int output = 0;
        int ip1_size = 0;
        ip1_size = Integer.parseInt(in.nextLine().trim());
        int[] ip1 = new int[ip1_size];
        int ip1_item;
        for(int ip1_i = 0; ip1_i < ip1_size; ip1_i++) {
            ip1_item = Integer.parseInt(in.nextLine().trim());
            ip1[ip1_i] = ip1_item;
        }
        int ip2 = Integer.parseInt(in.nextLine().trim());
        output = ThirstyCrowProblem(ip1,ip2);
        System.out.println(String.valueOf(output));
    }
     
         public static int ThirstyCrowProblem(int[] input1,int input2)
    { int no_of_pots = input1.length;
              int no_of_pots_overflow = input2;
              int temp_var = 0;

              if (input1 == null || no_of_pots_overflow < 0
                           || no_of_pots_overflow > input1.length || no_of_pots <= 0
                           || input1.length != no_of_pots) {
                    return -1;
              }
              
              if (0 == no_of_pots_overflow) {
                     return 0;
              }
              
              for (int i = 0; i < no_of_pots; i++) {
                     
                     if (input1[i] < 0) {
                           return -1;
                     }else if (input1[i] == 0) {
                           if (++temp_var == no_of_pots_overflow) {
                                  return 0;
                           }
                     }
              }
              
              Arrays.sort(input1);
              int final_array[] = new int[no_of_pots_overflow];
              
              for(int j=0;j<final_array.length;j++){
                     final_array[j] = input1[j];
              }
              
              int n = final_array.length-1;
              
              int min_stones = final_array[n]*(no_of_pots-no_of_pots_overflow+1);
              
              for(int k=0;k<n;k++){
                     min_stones = min_stones + final_array[k];
              }
              
              return min_stones;}
}