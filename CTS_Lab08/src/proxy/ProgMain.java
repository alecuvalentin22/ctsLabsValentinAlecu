package proxy;

public class ProgMain {

	public static void main(String[] args) {
		LoginModule loginModule = new LoginModule("admin", "1234");
		
		String [] dictionarPasswords = new String[] {"12345678", "123456", "123456hj", "323", "1234"};
		
		for(String password : dictionarPasswords) {
			if(loginModule.login("admin", password)) {
				System.out.println("FOUND IT" + password);
			}
		}
		
		System.out.println("------------------------------");
		
		ProxyLogin proxy = new ProxyLogin(loginModule);
		for(String password : dictionarPasswords) {
			if(proxy.login("admin", password)) {
				System.out.println("FOUND IT" + password);
			}
		}
	}

}
