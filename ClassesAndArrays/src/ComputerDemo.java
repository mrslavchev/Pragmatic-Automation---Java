
public class ComputerDemo {

	public static void main(String[] args) {
		Computer testComputer = new Computer();
		testComputer.setYear(2008);
		testComputer.setPrice(1198.45);
		testComputer.setNotebook(true);
		testComputer.setHardDiskMemory(180);
		testComputer.setFreeMemory(120);
		testComputer.setOperatingSystem("Windows");
		
		// some print just to make sure it works
//		System.out.println("Your configuration:");
//		System.out.printf("Year %d\n", testComputer.getYear());
//		System.out.printf("Price %f\n", testComputer.getPrice());
//		System.out.printf("Is it notebook %s\n", testComputer.isNotebook());
//		System.out.printf("HDD %d GB\n", testComputer.getHardDiskMemory());
//		System.out.printf("Free memory %d GB\n", testComputer.getFreeMemory());
		
		// combined both for one PC only, it will be the same for another PC
		System.out.println(testComputer.toString());
		testComputer.changeOperatingSystem("Ubuntu 14.04 LTS");
		System.out.println("New OS is: " + testComputer.getOperatingSystem());
		System.out.println("Memory before: " + testComputer.getFreeMemory());
		testComputer.useMemory(100);
		System.out.println("Memory left: " + testComputer.getFreeMemory());
	}

}
