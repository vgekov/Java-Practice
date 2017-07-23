import java.util.Scanner;

public class Task06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number");
		int firstNum = sc.nextInt();
		System.out.println("Enter second number");
		int secondNum = sc.nextInt();
		System.out.println("Enter third number");
		int thirdNum = sc.nextInt();

		int temp = firstNum;
		firstNum = secondNum;
		secondNum = thirdNum;
		thirdNum  = temp;
		

		System.out.println(firstNum);
		System.out.println(secondNum);
		System.out.println(thirdNum);

	}

}
