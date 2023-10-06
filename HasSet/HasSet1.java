package HasSet;
import java.util.HashSet;
import java.util.Iterator;
public class HasSet1 {
	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(1); // add element
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(2);
		
		System.out.println("Hashset elemnt : " + hs);
		Iterator itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		// Seach the element using contain function
		
		if(hs.contains(2)) {
			System.out.println("Set contain 2");
		}
		
		if(!hs.contains(6)) {
			System.out.println("Set does not contain 6 ");
		}
		
		// How to remove the element
		
		hs.remove(1);
		if(!hs.contains(1)) {
			System.out.println("set does not contain 1 ->  we deleted 1");
		}
		
		// size
		System.out.println("Set of size : "+hs.size());
		
		// print 
		
	}
}
