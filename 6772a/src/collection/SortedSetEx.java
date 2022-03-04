package collection;

import java.util.*;

public class SortedSetEx 
{
	public static void main(String[] args)
	{
		SortedSet<String> ss=new TreeSet<String>();

		ss.add("a");
		ss.add("e");
		ss.add("g");
		ss.add("b");
		ss.add("c");
		
		Object array[] = ss.toArray( );
		
		for(int x=0; x<5; x++)
		{
			System.out.println(array[x]);
		}
	}

}
