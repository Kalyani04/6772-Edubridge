package thread;

class P extends Thread
{
	public void run()
	{
		System.out.println("Thread P Started");
		for(int i=1;i<=4;i++)
		{
			System.out.println("From thread P : I ="+i);
		}
	System.out.println("EXIT FROM A");

	}
}
	
class Q extends Thread
{
	public void run()
	{
		System.out.println("Thread Q Started");
		for(int j=1;j<=4;j++)
		{
			System.out.println("From thread B : J ="+j);
		}
		System.out.println("EXIT FROM B");
	}
}

class R extends Thread
{
	public void run()
	{
		System.out.println("Thread R Started");
		for(int k=1;k<=4;k++)
		{
			System.out.println("From thread B : K ="+k);
		}
		System.out.println("EXIT FROM K");
	}
}

class ThreadPriority
{
	public static void main(String[] args) 
	{
		P threadP = new P();
		Q threadQ = new Q();
		R threadR = new R();
		
		threadR.setPriority(Thread.MAX_PRIORITY);

		threadQ.setPriority(threadP.getPriority()+1);
		threadP.setPriority(Thread.MIN_PRIORITY);
		System.out.println( "Start Thread A");

		threadP.start();
		System.out.println( "Start Thread R");

		threadR.start();
		threadQ.start();
		System.out.println("Exit from main thread ");

	}
		

	

}
