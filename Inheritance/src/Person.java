
class Person {
	protected int age;
	private String name;
	private boolean isMan;
	
	public Person(int age, String name, boolean isMan) {
		this.age = age;
		this.name = name;
		this.isMan = isMan;
	}
	
	void showPersonInfo(){
		System.out.printf("Info: \nName: %s\nAge: %d\n", this.name, this.age);
		if (isMan) {
			System.out.println("Gender: Male");
		}else {
			System.out.println("Gender: Female");
		}
	}
	
	
}
