import java.util.Scanner;

public class Task10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number between 10....9999");
		int number = sc.nextInt();
		
		if(number < 10 || number > 9999){
			System.out.println("Invalid number");
		}
		
		int extraBucket = number % 5;
		int twoBuckets = number  - extraBucket;
		int addBucket = twoBuckets / 5;
		
		System.out.println("To full barrel with " + number);
		System.out.println(addBucket + " Two liters");
		System.out.println(addBucket + " Threeliters");
		if(extraBucket != 0 && extraBucket < 4){
			System.out.println("One more bucket " + extraBucket);
		}
	}

}
