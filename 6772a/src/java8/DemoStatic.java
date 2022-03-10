package java8;

interface Engine
{
	public static void display()
	{
		System.out.println("This is java 8 static method ");
	}
}
public class DemoStatic implements Engine
{
	public static void main(String args[])
	{
		Engine.display();
	}
}
