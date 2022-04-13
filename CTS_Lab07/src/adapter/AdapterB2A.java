package adapter;

public class AdapterB2A extends DiscountA implements IDiscountB{

	@Override
	public double calculateDiscountB(Customer c) {
		// TODO Auto-generated method stub
		return this.calculateDiscountA(c.getNoOrders());
		
		//extend old, implement new
		// in the new you need to use what you are extending
	}

}
