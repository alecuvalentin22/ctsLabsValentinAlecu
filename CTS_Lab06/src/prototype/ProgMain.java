package prototype;

public class ProgMain {

	public static void main(String[] args) throws CloneNotSupportedException {

		Bookshop carturesti=new Bookshop().loadDataFromDatabase("carturesti");
		System.out.println(carturesti);
		
//		System.out.println("Shallow copy");
	//	Bookshop diverta=carturesti;
		
	System.out.println("Deep copy");
		Bookshop diverta=(Bookshop) carturesti.clone();
		diverta.getBooks().remove(3);
		System.out.println(carturesti);
	}

}
