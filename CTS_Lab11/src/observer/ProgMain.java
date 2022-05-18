package observer;

public class ProgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RainEvent rain = new RainEvent("rain" , false);
		
		IHandler mada = new MadaHandler();
		IHandler andreea = new AndreeaHandler();
		IHandler maria = new MariaHandler();
		
		rain.subscribeHandler(maria);
		rain.subscribeHandler(andreea);
		rain.subscribeHandler(mada);
		
		rain.activateEvent();

	}

}
