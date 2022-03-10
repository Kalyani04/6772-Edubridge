package java8;

import java.util.function.Function;

public class ChainingInterface
{
	public static void main(String[] args)
	{
		int amount = 3;
		Function<Integer, Integer> sum = i -> i + i; 

		Function<Integer, Integer> sqr = i -> i * i; 
		System.out.println(sum.apply(amount));
		System.out.println(sqr.apply(amount));

		System.out.println(sum.andThen(sqr).apply(amount));
		System.out.println(sum.compose(sqr).apply(amount));
} 
}