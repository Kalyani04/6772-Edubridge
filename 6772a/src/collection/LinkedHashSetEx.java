package collection;
import java.util.LinkedHashSet;

public class LinkedHashSetEx
{
	public static void main(String args[ ]) 	
	{
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add(new String("Pineapple"));
		lhs.add(new String("Apple"));
		lhs.add(new String("Custurd Apple"));
		Object array[] = lhs.toArray( );
		for(int x=0; x<3; x++)
		{
			System.out.println(array[x]);
		}
	}
}