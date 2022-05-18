package strategy;

public class Data {
	
	private int [] vector = null;
	private IStrategyFindSpecificNo strategy;
	
	public int[] getVector() {
		return vector;
	}
	public void setVector(int[] vector) {
		this.vector = vector;
	}
	public IStrategyFindSpecificNo getStrategy() {
		return strategy;
	}
	public void setStrategy(IStrategyFindSpecificNo strategy) {
		this.strategy = strategy;
	}
	public Data(int[] vector, IStrategyFindSpecificNo strategy) {
		super();
		this.vector = vector;
		this.strategy = strategy;
	}
	
	public int processVector() {
		return this.strategy.process(vector);
	}

}
