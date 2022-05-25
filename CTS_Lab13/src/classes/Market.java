package classes;

public class Market {

	private String name;
	private int area;
	private ETypeMarket type;

	public Market(String name, int area, ETypeMarket type) {
		super();
		this.name = name;
		this.area = area;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public ETypeMarket getType() {
		return type;
	}
	public void setType(ETypeMarket type) {
		this.type = type;
	}
	
	
}
