package facade;

public class ProgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Airline company = new Airline("CTS flights");
//		Flight toGo = company.flightBooking("Bucharest", "Cluj");
//		Flight back = company.flightBooking("Cluj", "Bucharest");
//		
//		Hotel hotel = new Hotel("Cts Hotel");
//		hotel.roomBooking("Cluj");
		
		Facade.reservation("Bucharest", "Cluj");
		
		
	}

}
