package java8;

import java.util.function.Predicate;

public class PredicateIsEqualEx
{

	public static void main(String[] args)
	{
		Predicate<String> name = Predicate.isEqual("Banglore");
		System.out.println(name.test("Banglore"));
	}
}