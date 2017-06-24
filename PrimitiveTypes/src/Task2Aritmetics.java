import java.util.Scanner;

public class Task2Aritmetics {
	public static void main(String[] args) {
		System.out.println("Write down two integers:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum = a + b;
		int extraction = a - b;
		int product = a * b;
		int division = a / b;
		int modulus = a % b;
		
		System.out.println("Resutls from int opeartions:");
		System.out.println("Sum: " + sum);
		System.out.println("Extraction: " + extraction);
		System.out.println("Product: " + product);
		System.out.println("Division: " + division);
		System.out.println("Modulus: " + modulus);
		
		System.out.println("Please write two float numbers:");
		float firstFloat = sc.nextFloat();
		float secondFloat = sc.nextFloat();
		
		float floatSum = firstFloat + secondFloat;
		float floatExtraction = firstFloat - secondFloat;
		float floatProduct = firstFloat * secondFloat;
		float floatDivision = firstFloat / secondFloat;
		float floatModulus = firstFloat % secondFloat;
		
		System.out.println("Resutls from float opeartions:");
		System.out.println("Sum: " + floatSum);
		System.out.println("Extraction: " + floatExtraction);
		System.out.println("Product: " + floatProduct);
		System.out.println("Division: " + floatDivision);
		System.out.println("Modulus: " + floatModulus);
	}
}
