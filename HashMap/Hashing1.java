package HashMap;
import java.util.*;
public class Hashing1 {
     public static void main(String[] args) {
    	 //Country(key) ->  Population(Value)
		 HashMap<String,Integer> map = new HashMap<>();
		 //Inseration 
		 map.put("India", 120);
		 map.put("Chaina", 150);
		 map.put("USA", 30);
		 
		 System.out.println(map);
		 
		 map.put("Chaina", 180);
		 System.out.println(map);
		 
		 // search operation
		 if(map.containsKey("Chaina")) {
			 System.out.println("China is present in map");
		 }else {
			 System.out.println("China is not preasent in map");
		 }
		 
		 // I want to get the value which map can exit
		 System.out.println(map.get("Chaina")); // key exits
		 System.out.println(map.get("Indonesia"));
		 
		 for(Map.Entry<String , Integer> e :  map.entrySet()) {
			 System.out.println("Itrate key : "+e.getKey());
			 System.out.println("Itrate value :" + e.getValue());
			 
		 }
		 
		 Set<String> keys = map.keySet();
		 for(String key : keys) {
			System.out.println(key + " "+map.get(key)); 
		 }
		 
		 map.remove("Chaina");
		 System.out.println(map);
	}
}
