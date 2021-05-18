
public class TicketBookingThread extends Thread{

	private TicketCounter tCounter;
	private String passengerName;
	private int seatsOfBook;
	
	public TicketBookingThread(TicketCounter tCounter, String passengerName, int seatsOfBook) {
		super();
		this.tCounter = tCounter;
		this.passengerName = passengerName;
		this.seatsOfBook = seatsOfBook;
	}
	
	public void run() {
		tCounter.checkOutSeat(passengerName, seatsOfBook);
	}
	
	
}
