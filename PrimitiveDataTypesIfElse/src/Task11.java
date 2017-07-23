import java.util.Scanner;

public class Task11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 3 digits number without zeros  from 111 .... 999");
		int num = sc.nextInt();

		if (num < 111 || num >= 999) {
			System.out.println("Invalid number");
		} else {

			int firstDig = num / 100;
			int secondDig = num / 10 % 10;
			int thirdDig = num % 10;

			if (firstDig == 0 || secondDig == 0 || thirdDig == 0) {
				System.out.println("Error number contains 0");
			}

			if (num % firstDig == 0 && num % secondDig == 0 && num % thirdDig == 0) {
				System.out.println("Divided");
			} else {
				System.out.println("Not divided");
			}

		}
	}
}
