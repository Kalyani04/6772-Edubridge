// WAP find out all the even numbers in the given array

package java8;
import java.util.function.Predicate;

public class PredicateEvenNo
{
public static void main(String[] args)
{
	int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	Predicate<Integer> even = x -> x % 2 == 0;
	for (int i : num)
	{
		if (even.test(i))
		{
			System.out.println(i);
		}
	}
}
}

