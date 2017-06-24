import java.util.Scanner;

public class Task2HalfArray {

	public static void main(String[] args) {
		System.out.println("Please write down length of the array that's divisible by 2: ");
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		
		while (length % 2 != 0) {
			System.out.println("Bad user! Try again: ");
			length = sc.nextInt();
		}
		
		int[] inputArr = new int[length];
		int half = inputArr.length / 2;
		for (int i = 0; i < inputArr.length; i++) {
			if (i < (inputArr.length / 2)) {
				System.out.println("Write down value for position: " + i);
				inputArr[i] = sc.nextInt();
			}else {
				inputArr[i] = inputArr[i % half]; 
			}
		}
		
		//print
		for (int i = 0; i < inputArr.length; i++) {
			System.out.println(inputArr[i]);
		}
	}

}
