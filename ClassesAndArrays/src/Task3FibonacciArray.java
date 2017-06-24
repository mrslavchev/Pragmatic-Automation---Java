import java.util.Scanner;

public class Task3FibonacciArray {

	public static void main(String[] args) {
		System.out.println("Write down a number: ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		int[] numbers = new int[10];
		
		for (int i = 0; i < numbers.length; i++) {
			if ((i == 0) || (i == 1)) {
				numbers[i] = input;
			}else {
				numbers[i] = numbers[i-1] + numbers[i-2];
			}
			
			System.out.println(numbers[i]);
		}

	}

}
