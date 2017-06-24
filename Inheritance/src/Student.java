
class Student extends Person{
	
	private double score;
	
	public Student(int age, String name, boolean isMan, double score) {
		super(age, name, isMan);
		if ((score <= 6) && (2 <= score)) {
			this.score = score;
		}
	}
	
	public void showStudentInfo(){
		super.showPersonInfo();
		System.out.println("Score: " + this.score);
	}
	
	

}
