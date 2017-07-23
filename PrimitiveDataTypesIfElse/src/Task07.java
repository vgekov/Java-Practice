import java.util.Scanner;

public class Task07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter money");
		double money = sc.nextDouble();
		System.out.println("Am i healthy true or false");
		boolean amIHealthy = sc.nextBoolean();

		if (amIHealthy == false) {
			System.out.println("Stay at home");
			if (money > 10) {
				System.out.println("Go to buy some medics");
			} else {
				System.out.println("Stay at home and drink tea like gentleman");
			}
		}
		if (amIHealthy == true) {
			if (money > 10) {
				System.out.println("Go to the cinema with friends");
			} else {
				System.out.println("Go to drink some coffee");
			}
		}

	}
}
