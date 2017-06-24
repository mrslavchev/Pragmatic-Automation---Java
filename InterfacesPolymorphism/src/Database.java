
class Database {
	
	private User[] users;
	
	

	public User[] getUsers() {
		return users;
	}



	public Database(int numberOfUsers){
		if (numberOfUsers <= 0) {
			throw new Error("Invalid number of users count!");
		}
		
		this.users = new User[numberOfUsers];
	}

}
