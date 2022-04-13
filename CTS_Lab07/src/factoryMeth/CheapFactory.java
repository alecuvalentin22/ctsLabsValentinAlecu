package factoryMeth;

public class CheapFactory implements IFactory{

	@Override
	public IWeapon getWeapon(int price) {
		// TODO Auto-generated method stub
		// return null;
		return new CheapWeapon();
	}
		
}
