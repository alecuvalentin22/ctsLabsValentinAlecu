package abstractFactory;

public class CheapFactory implements IFactory{

	@Override
	public IWeapon getWeapon() {
		// TODO Auto-generated method stub
		// return null;
		return new CheapWeapon();
	}

	@Override
	public ICostume getCostume() {
		// TODO Auto-generated method stub
		return new CheapCostume();
	}
		
}
