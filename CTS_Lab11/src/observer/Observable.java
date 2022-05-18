package observer;

import java.util.ArrayList;

public abstract class Observable {
	
	private ArrayList<IHandler> listObservers = new ArrayList<>();
	
	public void subscribeHandler(IHandler handler) {
		this.listObservers.add(handler);
	}
	
	public void unsubscribeHandler(IHandler handler) {
		this.listObservers.remove(handler);
	}
	
	public void notifyAllHandlers() {
		//!!!
		for(IHandler handler : this.listObservers) {
			handler.act();
		}
	}

}
