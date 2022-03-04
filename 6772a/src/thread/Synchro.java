package thread;

class BookMyShow
{
	static int total_tickets=10;
	synchronized public void bookTickets(int ticket)
	{
		if(total_tickets>=ticket)
		{
			total_tickets = total_tickets-ticket;
			System.out.println(ticket+" tickets has been booked & remaining are	"+total_tickets);
		}
		else
		{
			if(total_tickets<= 0)
			{
				System.out.println("Sorry all tickets are booked");
				
			}
			else
			{
				System.out.println("Sorry "+total_tickets+" are remaining ");

			}
		}
	}
}

public class Synchro extends Thread
{
	static BookMyShow book;
	int t;
	
	public void run()
	{
		book.bookTickets(t);
	}
	
	public static void main(String[] args)
	{
		book = new BookMyShow();
		Synchro Kalyani = new Synchro();
		Kalyani.t=3;
		Kalyani.start();
		
		Synchro Aditi = new Synchro();
		Aditi.t=5;
		Aditi.start();
	}
}
