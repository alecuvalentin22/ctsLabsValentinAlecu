package flyweight;

public class Receipt implements IReceipt{
	private String name="Mada SRL";
	private ReceiptType type;
	
	@Override
	public void printReceipt(ReceiptData data) {
		// TODO Auto-generated method stub
		System.out.println("Restaurant" + this.name + " " + 
		this.type + " " + data.getPrice());
	}

	public Receipt(ReceiptType type) {
		super();
		//this.name = name; PARTE PERMANENTA
		this.type = type;
	}

}
