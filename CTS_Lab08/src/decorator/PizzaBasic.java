package decorator;

public class PizzaBasic extends APizza{

	@Override
	public String getIngredient() {
		// TODO Auto-generated method stub
		return "mozzarella, tomato";
	}

	@Override
	public float getCost() { 
		// TODO Auto-generated method stub
		return 20;
	}

}
