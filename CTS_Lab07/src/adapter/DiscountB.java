package adapter;

public class DiscountB implements IDiscountB{
		
	@Override
	public double calculateDiscountB(Customer c) {
		double total = 0;
		for(int i = 0; i < c.getNoOrders(); i++) {
			total += c.getOrdersAmount()[i];
		}
		if(total < 300) {
			return 20;
		} else {
			return 25;
		}
	}
}
