//Create an ArrayList which will be able to store only Strings.
//Create a printAll method which will print all the elements
//using an Iterator.

package collection;

import java.util.*;


public class AssiQNo3 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Monica");
		list.add("Rachel");
		list.add("Pheebe");
		list.add("Chandler");
		
		printAll(list);
	}

	public static void printAll(List<String> list) {
		Iterator<String> it = list.iterator();
		
		while (it.hasNext())
			System.out.println(it.next());
	}
}