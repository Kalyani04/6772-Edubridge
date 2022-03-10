package java8;

interface FI
{
	public void add(int x, int y);
}
public class FunctionInterfaceAdd 
{
	public static void main(String[] args)
	{
		FI obj = (x,y) -> System.out.println("Addition is  "+(x+y));
		obj.add(6, 4);
				
	}

}
