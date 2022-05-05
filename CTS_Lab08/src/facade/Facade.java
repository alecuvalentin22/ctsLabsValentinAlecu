package facade;

public class Facade {
	
	public static void reservation(String initialLocation, String destination) {
		//flight
		//room
		
		Airline company = new Airline("CTS flights");
		Flight toGo = company.flightBooking(initialLocation, destination);
		Flight back = company.flightBooking(destination, initialLocation);
		
		Hotel hotel = new Hotel("Cts Hotel");
		hotel.roomBooking(destination);
	}
}
