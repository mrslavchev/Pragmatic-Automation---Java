import java.util.Date;

abstract class AbstractUser implements User{
	
	private String userName;
	private boolean isLogged;
	private Date registrationDate;
	
	public AbstractUser(String userName) {
		this.userName = userName;
		this.registrationDate = new Date();
	}
	
	@Override
	public String toString(){
		String result = "Username: " + this.userName + "\n" +
				"Logged in: " + this.isLogged + "\n" +
				"Date of registration: " + this.registrationDate.toString() + "\n";
		
		return result;
	}
	
	@Override
	public void login() {
		this.isLogged = true;
		
	}

	@Override
	public void logout() {
		this.isLogged = false;
		
	}

	@Override
	public String getUsername() {
		return this.userName;
	}

	@Override
	public String getDateRegistered() {
		return this.registrationDate.toString();
	}

}
