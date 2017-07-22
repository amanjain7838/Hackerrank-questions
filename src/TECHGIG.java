import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		int [][]arr = {{0, 1, 1, 0, 1}, 
                   {1, 1, 0, 1, 0}, 
                   {0, 1, 1, 1, 0},
                   {1, 1, 1, 1, 0},
                   {1, 1, 1, 1, 1},
                   {0, 0, 0, 0, 0}};
                   
                   maxAllOne(6,5,arr);
    
	}
	
	public static void maxAllOne(int row, int col, int [][]arr) {
	    int [][]aux = new int[row][col];
	    for (int i=0; i<col;i++) aux[0][i] = arr[0][i];
	    for (int i=0; i<row;i++) aux[i][0] = arr[i][0];
	    int maxTillNow = 0;
	    
	    for(int i=1; i<row; i++) {
	        for (int j=1; j<col; j++) {
	            if (arr[i][j] == 0) aux[i][j] = 0;
	            else aux[i][j] = Math.min(aux[i-1][j], Math.min(aux[i][j-1], aux[i-1][j-1]))+1;
	            maxTillNow = Math.max(maxTillNow, aux[i][j]);
	        }
	    }
	    
	    
	    for (int i=0; i<row; i++) {
	        for (int j=0; j<col; j++) {
	            System.out.print(aux[i][j] + " ");
	        }
	        System.out.println();
	    }
	    
	    System.out.println("Answer: " + maxTillNow);
	}
}