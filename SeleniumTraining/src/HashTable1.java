
import java.util.*;
public class HashTable1 {

	public static void main(String[] args) {
		Hashtable <Integer,String> hm = new Hashtable<Integer,String>();
		
		hm.put(100, "Ish");
		hm.put(102, "Nish");
		hm.put(101, "Jay");
		
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		

	}

}
