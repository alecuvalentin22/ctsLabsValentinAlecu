package composite;

import java.util.ArrayList;

public class Structure extends ANode{
	
	private String name;
	//missing price;
	
	private ArrayList<ANode> list = new ArrayList<ANode>();

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
//		return super.getInfo();
		
		String info = "" + this.getName()+" \n";
		for(ANode node:list) {
			info +=" " + node.getInfo() + " \n";
		}
		return info;
	}

	public Structure(String name) {
		super();
		this.name = name;
	}

	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
//		return 0;
		throw new UnsupportedOperationException();
	}

	@Override
	public void addNode(ANode element) {
		// TODO Auto-generated method stub
		//super.addNode(element);
		list.add(element);
	}

	@Override
	public void removeNode(ANode element) {
		// TODO Auto-generated method stub
		//super.removeNode(element);// Not ok 
		list.remove(element);
	}

	@Override
	public ANode getNode(int index) {
		// TODO Auto-generated method stub
		//super.getNode(index); 
		return this.list.get(index);
	}

}
