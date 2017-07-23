import java.util.Scanner;

public class Task02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter two integers");
		System.out.println("First: ");
		int firstNum = sc.nextInt();
		System.out.println("Second: ");
		int secondNum = sc.nextInt();
		
		int sum = firstNum + secondNum;
		int diff = firstNum - secondNum;
		int multip = firstNum * secondNum;
		int div = firstNum / secondNum;
		int divMod = firstNum % secondNum;
		
		System.out.println("Sum of numbers "  + sum );
		System.out.println("Difference of numbers "  + diff );
		System.out.println("Multiplication of numbers "  + multip );
		System.out.println("Divide of numbers "  + div );
		System.out.println("Modular  of numbers "  + divMod );
		
		
	}

}
