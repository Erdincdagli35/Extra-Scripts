
public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("HELLO\n");
		
		TicketCounter tc = new TicketCounter();
		
		TicketBookingThread t1 = new TicketBookingThread(tc,"Erdinç",1);
		TicketBookingThread t2 = new TicketBookingThread(tc,"Emre",1);
		
		
		t1.start();
		t2.start();
		
		//System.out.println("\nBYE");
		
	}

}
