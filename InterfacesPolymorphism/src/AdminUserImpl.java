
class AdminUserImpl extends AbstractUser implements AdminUser{
	
	private Database db;
	
	

	public AdminUserImpl(String userName) {
		super(userName);
		this.db = new Database(10);
	}
	
	@Override
	public void deleteUser(String userName) throws Exception  {
		for (int i = 0; i < this.db.getUsers().length; i++) {
			if (this.db.getUsers()[i] == null) {
				Exception NonExistingUser = new Exception("There's no such user!");
				throw NonExistingUser;
			}
			if (userName.equals(this.db.getUsers()[i].getUsername())) {
				db.getUsers()[i] = null;
				return;
			}
		}
	}

	@Override
	public User createNewUser(String userName, boolean isAdmin) throws Exception{
		User newUser;
		if (isAdmin) {
			newUser = new AdminUserImpl(userName);
		}else {
			newUser = new UserImpl(userName);
		}
		
		for (int i = 0; i < this.db.getUsers().length; i++) {
			if (this.db.getUsers()[i] == null) {
				this.db.getUsers()[i] = newUser;
				
				return newUser;
			}else if (this.db.getUsers()[i].getUsername() == userName) {
				System.out.println("User already exists");
				return newUser;
			}
		}
		
		Exception DatabaseFullException = new Exception("No available spots in database!");
		throw DatabaseFullException;
	}

	@Override
	public void printAllUsers() {
		
		for (int i = 0; i < this.db.getUsers().length; i++) {
			if (this.db.getUsers()[i] != null) {
				System.out.println(this.db.getUsers()[i].toString());
			}
		}
	}

}
