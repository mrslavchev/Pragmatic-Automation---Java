import java.util.Scanner;

public class Task4AscendingNumbers {
	public static void main(String[] args) {
		System.out.println("Write down two different numbers:");
		Scanner sc = new Scanner(System.in);
		
		int firstNum = sc.nextInt();
		int secondNum = sc.nextInt();
		
		if (firstNum == secondNum) {
			System.out.println("The numbers should have  different values.");
		}else {
			if (firstNum > secondNum) {
				System.out.println("Numbers in ascending order: " + secondNum 
						+ " , " + firstNum);
			}else {
				System.out.println("Numbers in ascending order: " + firstNum 
						+ " , " + secondNum);
			}
		}
	}
}
