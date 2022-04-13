package adapter;

public class AdapterA2B extends DiscountB implements IDiscountA{

	@Override
	public double calculateDiscountA(int noOrders) {
		// TODO Auto-generated method stub
		Customer c = new Customer("-", noOrders, {0,0,0});
		return this.calculateDiscountB();
	}

}
