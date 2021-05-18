
public class TicketCounter {

	private int availableSeats = 13;
	
	public synchronized void checkOutSeat(String passengerName,int numberOfSeats) {
		if ((availableSeats>= numberOfSeats) && (numberOfSeats>0)) {
			System.out.println("Hi,"+passengerName+" : "+numberOfSeats+".Seat booked successfully");
			availableSeats =- numberOfSeats;
		}
		else {
			System.out.println("Hi,"+passengerName+" : Seats Not Available");
		}
	}
}
