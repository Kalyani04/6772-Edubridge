package collection;
import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetEx
{
	public static void main(String args[ ])
	{

		TreeSet<String> tree = new TreeSet<String>();
		tree.add("Kalyani");
		tree.add("Gautami");
		tree.add("Aishwarya");
		tree.add("Manasvi");

		Iterator iterator = tree.iterator( );
		while(iterator.hasNext( ))
		{
			System.out.println(iterator.next( ).toString( ));
		}
	}
}