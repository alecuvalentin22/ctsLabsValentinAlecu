package adapter;

public class DiscountA implements IDiscountA {
	
	@Override
	public double calculateDiscountA(int noOrders) {
		if(noOrders < 100){
			return 10;
		} else {
			return 15;
		}
	}
}
