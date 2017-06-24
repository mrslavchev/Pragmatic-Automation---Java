
class Employee extends Person{

	private double daySalary;
	
	public Employee(int age, String name, boolean isMan, double daySalary) {
		super(age, name, isMan);
		this.daySalary = daySalary;
	}
	
	void showEmployeeInfo(){
		super.showPersonInfo();
		System.out.println("Daily salary: " + daySalary);
	}
	
	double calculateOvertime(double hours){
		if (this.age < 18) {
			return 0.0;
		}else {
			double salaryPerHour = this.daySalary / 24;
			return salaryPerHour * 1.5;
		}
	}
	
	
}
