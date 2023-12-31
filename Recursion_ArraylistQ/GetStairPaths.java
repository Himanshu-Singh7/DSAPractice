package Recursion_ArraylistQ;
import java.util.*;
public class GetStairPaths {
      public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<String> paths = getStairPaths(n);
		System.out.println(paths);
		
	}
      
      public static ArrayList<String> getStairPaths(int n) {
    	  
    	  if(n == 0) {
    		  ArrayList<String> nzero = new ArrayList<>();
    		  nzero.add("");
    		  return nzero;
    	  }else if(n < 0) {
    		  ArrayList<String> nneg = new ArrayList<>();
    		  return nneg;
    	  }
    	  ArrayList<String> paths1 = getStairPaths(n-1);
    	  ArrayList<String> paths2 = getStairPaths(n-2);
    	  ArrayList<String> paths3 = getStairPaths(n-3);
    	  
    	  ArrayList<String> paths = new ArrayList<>();
    	  for(String path : paths1) {
    		  paths.add(1 + path);
    	  }
    	  for(String path : paths2) {
    		  paths.add(2 + path);
    	  }
    	  for(String path : paths3) {
    		  paths.add(3 + path);
    	  }
    	  
          return paths;
      }

}
