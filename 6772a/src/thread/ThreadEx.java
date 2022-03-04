package thread;

class A extends Thread 
{
	public void run()
	{
		System.out.println("Thread A is started");
		for(int i=1;i<=10; i++) 
		{
			System.out.println ("value of i in thread A"+i);
		}
		System.out.println ("Thread A is Exit");
	}
}

class B extends Thread
{
	public void run()
	{
		System.out.println("Thread B is started");
		for(int j=1;j<=10; j++) 
		{
			System.out.println ("value of j in thread B"+j);
		}
		System.out.println ("Thread B is Exit");
	}
}

class C extends Thread
{
	public void run()
	{
		System.out.println("Thread C is started");
		for(int K=1;K<=10; K++) 
		{
			System.out.println ("value of K in thread A"+K);
		}
		System.out.println ("Thread K is Exit");
	}
}

public class ThreadEx
{
	public static void main(String[] args)
	{
		A obj1 = new A();
		B obj2 = new B();
		C obj3 = new C();
		
		obj1.start();
		obj2.start();
		obj3.start();
		
	}
}
