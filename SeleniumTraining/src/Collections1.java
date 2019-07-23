
import java.util.*;
public class Collections1 {

	public static void main(String[] args) {
		
ArrayList<String> list = new ArrayList<String>();// Syntax to create arraylist
list.add("Jayshree");// Adding objects in Arraylist
list.add("Ish");
list.add("Abhishek");


Iterator itr = list.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}

	}

}
