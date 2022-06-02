package facade;

public class Hotel {
	
	private String name;
	
	public void roomBooking(String location) {
		System.out.println("Hotel: " + this.name + " from " + location + " 1 room");
	}

	public Hotel(String name) {
		super();
		this.name = name;
	}
}
