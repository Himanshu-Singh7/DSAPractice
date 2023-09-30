package recursion_backtracking;
import java.util.*;
public class NQueensProbleams {
	
	
      public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[][] = new int[n][n];
		printNQueens(arr,"",0);
	}
      
      public static void printNQueens(int[][] chess, String qsf, int row) {
    	  
    		if(row == chess.length) {
    		  System.out.println(qsf + " ");
    		  return;
    	  }
         for(int col = 0 ; col < chess.length ; col++) {
        	 if(itqueenisSafe(chess, row, col) == true) {
        		 
        	 chess[row][col] = 1;
        	 printNQueens(chess, qsf + row + "-" + col+ "," ,row +1); 
        	 chess[row][col] = 0;
         }
         }
      }
    	
    	  
      
      
      public static boolean itqueenisSafe(int [][]chess , int row , int col) {
    	  
    	  // Vertical
    	  for(int i = row -1, j = col ; i >= 0 ; i--){
    		  if(chess[i][j] == 1) {
    			  return false;
    		  }
    	  }
    	  // Left dignol
    	  
    	  for(int i = row-1, j = col-1 ; i >= 0 && j >= 0 ; i-- ,j--) {
    		  if(chess[i][j] == 1) {
    			  return false;
    		  } 
    	  }
    	  
    	  // Right dignol
    	  for(int i  = row-1,j =col +1 ; i >= 0 && j < chess.length ; i--, j++) {
    		  if(chess[i][j] == 1) {
    			  return false;
    		  } 
    	  }
    	  
    	  
    	  
		return true;
    	  
      }
}
