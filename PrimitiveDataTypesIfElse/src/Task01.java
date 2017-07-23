import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter three numbers");
		System.out.println("Enter first number");
		double firstNumber = sc.nextDouble();
		System.out.println("Enter second number");
		double secondNumber = sc.nextDouble();
		System.out.println("Enter third number");
		double thirdNumber = sc.nextDouble();
		
		
		if(firstNumber < thirdNumber && secondNumber > thirdNumber){
			System.out.println("The number " +  thirdNumber + " is between " + firstNumber + " " + secondNumber);
		}
		
		
		
	}

}
