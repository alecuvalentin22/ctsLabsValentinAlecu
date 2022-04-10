package factory;
//used for hiding details about the object that is created
public class ProgMain {

	public static void main(String[] args) {

		//hide what it's created
		//IWeapon weapon;//=new MagicWeapon();
		
		IWeapon weapon;
		try {
			weapon=WeaponFactory.createWeapon(200);
			weapon.power();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
