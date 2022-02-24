package string;

import java.util.StringJoiner;

public class StringJoinerMerge
{
	public static void main(String[] args)
	{

		StringJoiner joinNames= new StringJoiner(",", "[", "]");

		joinNames.add("Rahul");
		joinNames.add("Raju");
		StringJoiner joinNames2= new StringJoiner(":", "#","#");

		// Adding values to StringJoiner
		joinNames2.add("Peter");
		joinNames2.add("Raheem");
		StringJoiner merge= joinNames.merge(joinNames2);

		System.out.println(merge);
	}
}