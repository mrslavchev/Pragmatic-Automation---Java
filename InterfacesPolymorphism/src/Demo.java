
public class Demo {

	public Demo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception {
		
		// Adding two users - admin and non-admin 
		AdminUserImpl admin = new AdminUserImpl("viktor");
		User userGo6o = (UserImpl)admin.createNewUser("go6ko", false);
		AdminUser adminPe6ko = (AdminUserImpl)admin.createNewUser("admin4ity", true);
		admin.printAllUsers();
		System.out.println("-------Line here----------");
		
		// trying to add user with same username
		User cheater = (UserImpl)admin.createNewUser("admin4ity", false);
		admin.printAllUsers(); // printing again to prove it's not added 
		System.out.println("-------Line here----------");
		
		// Deleting users 
		admin.deleteUser("admin4ity");
		admin.printAllUsers();
		System.out.println("-------Line here----------");
		admin.deleteUser("go6ko");
		admin.printAllUsers();
		System.out.println("-------Line here----------");
		// Trying to delete user from empty db. 
		//admin.deleteUser("milen"); // uncomment it as it throws exception
		
		// Create more user than the capacity of the db 
		User newUser;
		for (int i = 0; i < 11; i++) {
			newUser = (UserImpl)admin.createNewUser("user" + i, false);
		}
		
		admin.printAllUsers();
	}

}
