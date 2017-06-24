import java.util.Scanner;

public class Task4MirrorArray {

	public static void main(String[] args) {
		System.out.println("Write down length of array");
		Scanner sc = new Scanner(System.in);
		
		int len = sc.nextInt();
		
		int[] inputArray = new int[len];
		
		// filling the array
		System.out.println("Write down values:");
		for (int i = 0; i < inputArray.length; i++) {
			System.out.printf("Index %d \n", i);
			inputArray[i] = sc.nextInt();
		}
		
		boolean isMirror = true;
		int half;
		
		if ((inputArray).length % 2 == 0) {
			half = inputArray.length / 2;
		}else {
			half = (inputArray.length / 2) + 1;
		}
		
		int invertIndex;		
		for (int i = 0; i < half; i++) {
			invertIndex = inputArray.length - i - 1;
			if (inputArray[i] != inputArray[invertIndex]) {
				isMirror = false;
				break;
			}
			if (i == invertIndex) {
				break;
			}
		}
		
		if (isMirror) {
			System.out.println("The array is mirror.");
		}else {
			System.out.println("The array IS NOT mirror.");
		}
	}

}
