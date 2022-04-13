package factoryMeth;

public class MagicFactory implements IFactory{

	@Override
	public IWeapon getWeapon(int price) {
		// TODO Auto-generated method stub
		// return null;
		return new MagicWeapon();
	}

}
