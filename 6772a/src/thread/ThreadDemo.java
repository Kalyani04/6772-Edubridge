package thread;

public class ThreadDemo {

	public static void main(String[] args) 
	{
		Thread t = new Thread();
		System.out.println("My Current Thread is" +t.currentThread());
		System.out.println("My Current Thread is"+t.getName());

		t.setName("My Thread 1");
		System.out.println("My Current Thread is"+t.getName());
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Value of i  "  +i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}

		}

	}

}
