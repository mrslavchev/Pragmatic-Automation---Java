
interface AdminUser extends User{
	void deleteUser(String userName) throws Exception;
	User createNewUser(String userName, boolean isAdmin) throws Exception;
	void printAllUsers();
}
