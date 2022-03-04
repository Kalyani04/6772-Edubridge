package collection;
import java.util.*;
public class HashtableEx
{
	public static void main(String args[ ])
	{

	Hashtable<String,Integer> t = new Hashtable<String,Integer>();
	
	t.put("One",1);
	t.put("five",5);
	t.put("Six",6);
	t.put("Nine",9);
	

	Set s = t.entrySet();
	Iterator itr = s.iterator();
	
	while(itr.hasNext())
	{
		Map.Entry m = (Map.Entry)itr.next();
		System.out.println(m.getKey()+ "  "+m.getValue());
	}
	
	
	}

	


}



