package OopsConcept;

class Animal
{
	int z;
	public Animal(int c)
	{
		System.out.println("This is the constructor");
	}
	public void move()
	{
		System.out.println("Animal can move"+z);
	}
}

class Dog extends Animal
{
	public Dog(int x, int y)
	{
		
		super(x);
		super.z = 90;
		
		System.out.println(x+"Derived class Constructor"+y);
	}
	public void move()
	{
		super.move();
		System.out.println("Dogs can walk and run");
		
	}
}

public class MethodOverriding2
{
	public static void main(String[] args)
	{
		Dog b = new Dog(22,33);
		b.move();
	}
}
