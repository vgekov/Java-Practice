import java.util.Scanner;

public class Task04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int firstNumber = sc.nextInt();
		System.out.println("Enter second number");
		int secondNumber = sc.nextInt();
		
		
		
		if ( firstNumber < secondNumber){
			System.out.println(firstNumber);
			System.out.println(secondNumber);
		}else{
			System.out.println(secondNumber);
			System.out.println(firstNumber);
		}
	}

}
