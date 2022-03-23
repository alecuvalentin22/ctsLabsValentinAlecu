package solid;

public class Calculator {
	private enum Operations{ADD, SUBSTRACT, MULTIPLY, DIVIDE};
	Calculator(){
		
	}
	
	public double calculate ( double a, double b, int i) {
		switch(i) {
		case 1:
			return a+b;
			//break;
		case 2:
			return a-b;
		default:
			return 0;
				
		}
	}
}
