package factoryMeth;

public class ProgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// SIMPLE FACTORY 
		
//		Factory factory = new Factory();
//		
//		IWeapon weapon = factory.getWeapon(300);
//		weapon.power();
		
		// FACTORY METHOD
		
		IFactory factory = new CheapFactory();
		IWeapon weapon = factory.getWeapon(0);
		// We dont need price anymore
		weapon.power();
		
	}

}
