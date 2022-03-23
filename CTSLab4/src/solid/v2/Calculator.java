package solid.v2;

public class Calculator {
	
	public double calculate(double a, double b, IOperationType op) {
		return op.calculate(a, b);
	};
}
