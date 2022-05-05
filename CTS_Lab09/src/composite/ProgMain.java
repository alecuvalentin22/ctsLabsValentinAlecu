package composite;

public class ProgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Structure menu = new Structure("Menu");
		
		Structure menuDrinks = new Structure("Drinks");
		Structure menuFood = new Structure("Food");
		
		menu.addNode(menuDrinks);
		menu.addNode(menuFood);
		
		menu.addNode(new Node("Pizza Carbonara", 20));
		menu.addNode(new Node("Pizza Margerita", 20));
		menu.addNode(new Node("Pasta", 20));
		
		System.out.println(menu.getInfo());
	}

}
