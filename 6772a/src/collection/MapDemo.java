package collection;
import java.util.*;

public class MapDemo
{
	public static void main(String[] args)
	{
		Map<String, String> fruit = new HashMap<String, String>();
		fruit.put("Apple", "red");
		fruit.put("Pear", "yellow");
		fruit.put("Plum", "purple");
		fruit.put("Cherry", "red");
		for (String key : fruit.keySet())
		{
			System.out.println(key + ": " + fruit.get(key));
		}
	}
}