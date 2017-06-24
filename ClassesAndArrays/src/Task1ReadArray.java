import java.util.Scanner;

public class Task1ReadArray {

	public static void main(String[] args) {
		
		System.out.println("Please write down length of the array: ");
		Scanner sc = new Scanner(System.in);
		
		int length = sc.nextInt();
		int[] inputArr = new int[length];
		int smallest = 0;
		
		for (int i = 0; i < inputArr.length; i++) {
			System.out.printf("Write down number for index: %d ", i);
			inputArr[i] = sc.nextInt();
			if ((inputArr[i] != 0) && (inputArr[i] % 3) == 0) {
				if (smallest > inputArr[i] || smallest == 0) {
					smallest = inputArr[i];
				}
			}
		}
		
		if (smallest == 0) {
			System.out.println("No such number!");
			
		}else {
			System.out.println("The number is: " + smallest);
		}
	}

}
