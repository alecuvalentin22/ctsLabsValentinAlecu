package facade;

public class Airline {
	
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Airline(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	public Flight flightBooking(String initialLocation, String destination) {
		Flight flight = new Flight(initialLocation, destination, this);
		return flight;
	}
		
}
