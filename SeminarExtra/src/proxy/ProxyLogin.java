package proxy;

public class ProxyLogin implements ILoginModule{
	
	ILoginModule moduleLogin;
	int counter = 0;
	
	public ProxyLogin(ILoginModule moduleLogin) {
		super();
		this.moduleLogin = moduleLogin;
	}
	
	@Override
	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		if(counter >= 3 ) {
			System.out.println("bruteforce detected");
			return false;
		}
		boolean result = this.moduleLogin.login(username, password);
		if(!result) {
			counter++;
		}
		else {
			counter = 0;
		}
		return result;
	}

}
