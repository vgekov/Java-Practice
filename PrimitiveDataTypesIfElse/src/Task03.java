import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers");
		System.out.println("Enter first number");
		int firstNumber = sc.nextInt();
		System.out.println("Enter second number");
		int secondNumber = sc.nextInt();		
		
		int temp = firstNumber;
		firstNumber = secondNumber;
		secondNumber = temp;
		
		System.out.println("After swap first " + firstNumber);
		System.out.println("After swap second " + secondNumber);
	}

}
