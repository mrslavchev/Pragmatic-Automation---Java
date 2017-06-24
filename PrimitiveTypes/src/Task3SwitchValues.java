import java.util.Scanner;

public class Task3SwitchValues {
	public static void main(String[] args) {
		System.out.println("Write down two different numbers:");
		Scanner sc = new Scanner(System.in);
		
		int firstNum = sc.nextInt();
		int secondNum = sc.nextInt();
		
		if (firstNum == secondNum) {
			System.out.println("The numbers should have  different values.");
		}else {
			firstNum ^= secondNum;
			secondNum ^= firstNum;
			firstNum ^= secondNum;
			
			System.out.println("Switched values are first: " + firstNum 
					+ " second:" + secondNum);
		}
	}
}
