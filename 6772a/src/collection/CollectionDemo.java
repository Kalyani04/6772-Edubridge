package collection;
 import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CollectionDemo {

	public static void main(String[] args) {

		List data = new ArrayList();
		Set data = new HashSet();
		data.add(22);
		data.add("Kalyani");
		data.add("Aditi");
		data.add("Tanvi");
		data.add("Aishwarya");
		data.add("4.8");

		Collections.sort(data);
		
		for (int i = 0; i < data.size(); i++) 
//		{
//			System.out.println(data.get(i));
//		}
//		
//		Iterator itr= data.iterator();
//		
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
	}
}
