package proxy;

public class LoginModule implements ILoginModule{
	private  String user;
	private String pass;
	
	public LoginModule(String user, String pass) {
		super();
		this.user = user;
		this.pass = pass;
	}

	@Override
	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		if(this.user.equals(username) && this.pass.equals(password)) {
			return true;
		}
		return false;
	}

}
