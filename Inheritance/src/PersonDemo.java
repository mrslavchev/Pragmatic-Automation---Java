
public class PersonDemo {

	public static void main(String[] args) {
		Person[] persons = new Person[10];
		
		Person gosho = new Person(30, "Georgi", true);
		Person maria = new Person(25, "Maria", false);
		
		Student ivancho = new Student(8, "Ivancho", true, 3.44);
		Student gincheto = new Student(9, "Ginka", false, 6.00);
		
		Employee genata = new Employee(24, "Gencho", true, 4000);
		Employee nezakonen = new Employee(16, "Malak draznitel", false, 500);
		
		persons[0] = gosho;
		persons[2] = maria;
		persons[3] = ivancho;
		persons[4] = gincheto;
		persons[6] = genata;
		persons[9] = nezakonen;
		
		//Task 4
		System.out.println("Show info:");
		for (int i = 0; i < persons.length; i++) {
			if (persons[i]instanceof Employee) {
				((Employee)persons[i]).showEmployeeInfo();
				System.out.println("................"); // separator for better visibility
			}else if (persons[i]instanceof Student) {
				((Student)persons[i]).showStudentInfo();
				System.out.println("................");
			}else if ( persons[i] instanceof Person) {
				persons[i].showPersonInfo();
				System.out.println("................");
			}
		}
		
		//Task5 
		System.out.println("Overtime calc:");
		for (Person person : persons) {
			if (person instanceof Employee) {
				System.out.println("Overtime bonus: " + 
						((Employee)person).calculateOvertime(2.0));
				System.out.println("................"); // separator for better visibility
			}
		}

	}
}
