package java8;

interface TestInterface
{
	public void square(int a); // abstract method
	default void show() // default method
	{
		System.out.println("Default Method Executed");
	}
}
class DefaultMethodInterface implements TestInterface
{
	@Override
	public void square(int a)
	{
		System.out.println(a*a);
	}

public static void main(String args[])
{
	DefaultMethodInterface d = new DefaultMethodInterface();

	d.square(4); // default method executed

	d.show();
	}
}

