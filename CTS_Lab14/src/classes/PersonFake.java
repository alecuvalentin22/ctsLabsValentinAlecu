package classes;

import interfaces.IPerson;

public class PersonFake implements IPerson {
	private String name;
	private String personalNumber;
	private int age;
	private int[] costReceipts;
	public PersonFake(String name, String personalNumber, int age, int[] costReceipts) {
		super();
		this.name = "Mada";
		this.personalNumber = "1224433";
		this.age = 18;
		this.costReceipts = costReceipts;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPersonalNumber() {
		return personalNumber;
	}
	public void setPersonalNumber(String personalNumber) {
		this.personalNumber = personalNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int[] getCostReceipts() {
		return costReceipts;
	}
	public void setCostReceipts(int[] costReceipts) {
		this.costReceipts = costReceipts;
	}
	@Override
	public double calcAvgCosts() throws Exception {
		Person p=new Person(this.getName(), this.getPersonalNumber(), this.getAge(), this.costReceipts);
		
		return p.calcAvgCosts();
	}
	
	
}
