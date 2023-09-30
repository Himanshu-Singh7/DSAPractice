package StringBuilder;

public class Demo1 {
   public static void main(String[] args) {
	
//	   StringBuilder sb = new StringBuilder("hello");
//	   System.out.println(sb);
//	   
//	   char ch = sb.charAt(1);  // get the data
//	   System.out.println(ch);
//	   
//	   sb.setCharAt(0, 'd');   //update
//	   System.out.println(sb);
//	   
//	   // insert
//	   sb.insert(2, 'y');
//	   System.out.println(sb);
//	   
//	   //delete 
//	   sb.deleteCharAt(2);
//	   System.out.println(sb);
//	   
//	  // add in last
//	   sb.append('m');
//	   System.out.println(sb);
	   
	   int n = 10000000;
	   long start = System.currentTimeMillis();
//	   String str = " ";
//	   
//	   for(int i = 0 ; i < n; i++) {
//		   str += i; 
//      }
	   
	   StringBuilder sb = new StringBuilder("");
	   for(int i = 0 ; i < n ; i++) {
		   sb.append(i);
	   }
	   
	   long end = System.currentTimeMillis();
	   long duration = end - start;
	   System.out.println(duration);
	    
	   
	   
    }
}
