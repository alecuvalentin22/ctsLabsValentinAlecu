package abstractFactory;

public class MagicFactory implements IFactory{

	@Override
	public IWeapon getWeapon() {
		// TODO Auto-generated method stub
		// return null;
		return new MagicWeapon();
	}

	@Override
	public ICostume getCostume() {
		// TODO Auto-generated method stub
		return new MagicCostume();
	}

}
