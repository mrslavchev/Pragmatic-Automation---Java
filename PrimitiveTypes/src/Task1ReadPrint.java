import java.util.Scanner;

public class Task1ReadPrint {

	public static void main(String[] args) {
		System.out.println("Please write a number for A:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		System.out.println("Please write a number for B:");
		int b = sc.nextInt();
		
		System.out.println("Please write a number for C:");
		int c = sc.nextInt();
		
		if ((c > a) && (c < b)) {
			System.out.println("C is between A and B");
		}else {
			System.out.println("C IS NOT between A and B");
		}
		
	}

}
