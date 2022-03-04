package collection;
import java.util.*;

public class HashMapEx 
{
	public static void main(String[] args)
	{
		HashMap<String, String> map = new HashMap<String,String>();
		map.put("Kalyani", "1111");
		map.put("Aditi", "2222");
		map.put("Sana","3333");
		map.put("Khushi","4444");
		
//		System.out.println("Keys : " +map.keySet());
//		System.out.println("Values : " +map.values());

		Set set = map.entrySet();
		Iterator itr = set .iterator();
		while(itr.hasNext())
		{
			Map.Entry m =(Map.Entry)itr.next();
			System.out.println(m.getKey()+"   "+m.getValue());
		}
		
		
	}
}
