import java.util.Scanner;

public class Task9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int firstNum = sc.nextInt();
		System.out.println("Enter second number");
		int secondNum = sc.nextInt();
		
		int result = firstNum * secondNum;
		
		
		if(result % 5 == 0){
			System.out.println("Odd");
		}else{
			System.out.println("Even");
		}
		
	}

}
