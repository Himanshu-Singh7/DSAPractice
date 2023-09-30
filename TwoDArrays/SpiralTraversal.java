package TwoDArrays;

import java.util.*;
public class SpiralTraversal {
    
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		// fill the arrays
		int arr[][] = new int[n][m];
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0; j < arr[0].length ; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		// Logic of spiral Traversal 2D Arrays
		
		int min_row = 0;
		int min_col = 0;
		int max_row = arr.length - 1;
		int max_col = arr[0].length - 1;
		int tne = n *m;
		int count =0;
		
		while(count < tne) {
			// left wall
			for(int i = min_row , j = min_col ; i <= max_row && count < tne ; i++ ) {
				
				System.out.println(arr[i][j]);
				count++;
			}
			min_col++;
			
			//Bottom wall 
			for(int i = max_row , j = min_col ; j <= max_col && count < tne ; j++ ) {
				
				System.out.println(arr[i][j]);
				count++;
			}
			max_row--;
			
			// Right wall
				for(int i = max_row , j = max_col ; i >= min_row && count < tne; i-- ) {
								
					 System.out.println(arr[i][j]);
					 count++;
				}
				max_col--;
			
			// Top Wall
				for(int i = min_row , j = max_col ; j >= min_col && count < tne ; j-- ) {
					
					 System.out.println(arr[i][j]);
					 count++;
				}
				min_row++;
		}
		
	}
}
