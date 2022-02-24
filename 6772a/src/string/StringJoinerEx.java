package string;
import java.util.StringJoiner;

public class StringJoinerEx
{
	public static void main(String[] args)
	{
		// List<Integer> list = new ArrayList<Integer>();
		
		StringJoiner joinNames = new StringJoiner(","); 
		joinNames.add("Chiku");
		joinNames.add("Kuki");
		joinNames.add("Chakuli");
		joinNames.add("Manu");
		System.out.println(joinNames);}
}
