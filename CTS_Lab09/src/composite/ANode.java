package composite;

public abstract class ANode {
		
	public abstract String getName();
	public abstract float getPrice();
	
	public String getInfo() {
		return getName() + getPrice();
	}
	
	public void addNode(ANode element) {
		throw new UnsupportedOperationException();
	}
	
	public void removeNode(ANode element) {
		throw new UnsupportedOperationException();
	}
	
	public ANode getNode(int index) {
		throw new UnsupportedOperationException();
	}
	
}
