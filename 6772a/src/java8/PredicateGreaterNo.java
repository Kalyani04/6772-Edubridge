package java8;

import java.util.function.Predicate;

public class PredicateGreaterNo
{
	public static void main(String[] args)
	{
		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		Predicate<Integer> grt = y -> y>5;
		for (int i : num)
		{
			if (grt.test(i))
			{
				System.out.println(i);
			}
		}
	}
}