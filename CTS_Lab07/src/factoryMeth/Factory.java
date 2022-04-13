package factoryMeth;

public class Factory implements IFactory{

	@Override
	public IWeapon getWeapon(int price) {
		// TODO Auto-generated method stub
		//return null;
		if(price > 200) {
			return new MagicWeapon();
		} else {
			return new CheapWeapon();
		}
	}

}
