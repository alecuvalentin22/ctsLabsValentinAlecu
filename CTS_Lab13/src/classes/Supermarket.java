package classes;

import java.util.ArrayList;

import exceptions.ExceptionMarket;

public class Supermarket {
	
	private String name;
	//private int area; can be calculated
	
	private ArrayList<Market> marketList=new ArrayList<>();
	public Supermarket(String name, ArrayList<Market> marketList) {
		super();
		this.name = name;
		this.marketList = marketList;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Market> getMarketList() {
		return marketList;
	}
	public void setMarketList(ArrayList<Market> marketList) {
		this.marketList = marketList;
	}
	
	public Market getBigestMarketByArea(ETypeMarket typeMarket) throws ExceptionMarket {
		
		if(this.marketList==null||this.marketList.size()==0) {
			throw new ExceptionMarket();
		}
		
		Market m=null;
		int maxArea=-1;
		for(int i=0;i<this.marketList.size();i++) {
			if(this.marketList.get(i).getArea()>maxArea
					&&this.marketList.get(i).getType()==typeMarket) {
				m=this.marketList.get(i);
				maxArea=m.getArea();
			}
		}
		
		if(m==null) {
			throw new ExceptionMarket();
		}
		return m;
	}

}
