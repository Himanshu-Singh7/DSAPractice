package TwoDArrays;

import java.util.*;
public class MatrixMultification {
        public static void main(String[] args) {
	     
        Scanner scn = new Scanner(System.in);
        // First Matrix
        int r1 = scn.nextInt();
        int c1 = scn.nextInt();
        
        int[][] one = new int[r1][c1];
        for(int i = 0; i < one.length ; i++) {
        	for(int j = 0 ;j < one[0].length ; j++) {
        		one[i][j] = scn.nextInt();
        	}
        }
        // Secoond matrix
        int r2 = scn.nextInt();
        int c2 = scn.nextInt();
        
        int[][] two = new int[r2][c2];
        for(int i = 0; i < two.length ; i++) {
        	for(int j = 0 ;j < two[0].length ; j++) {
        		two[i][j] = scn.nextInt();
        	}
        }
       // For invalid Operation 
	   if(c1 != r2) {
		   System.out.println("Invalid operation");
	   }
	   // product of matrix first rows to second column
	   int [][] prod = new int[r1][c2];
	   
	   for(int i = 0; i < prod.length ; i++) {
		   for(int j = 0; j < prod[0].length ; j++ ) {
			   for(int k = 0; k < c1 ; k++) {
				   prod[i][j] += one[i][k] * two[k][j]; 
			   }
		   }
	   }
	   
	   for(int i = 0; i < prod.length ; i++) {
		   for(int j = 0; j < prod[0].length ; j++ ) {
			   System.out.print(prod[i][j] + " ");
		     }
		   System.out.println();
		   }
	     
	   
	}
}
