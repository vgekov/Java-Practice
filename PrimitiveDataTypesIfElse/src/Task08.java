import java.util.Scanner;

public class Task08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number 1000......9999");
		int num = sc.nextInt();
		
		if(num < 1000 && num > 9999){
			System.out.println("Invalid number");
		}
		
		int firstNum = num / 1000;
		int secondNum = num / 100 % 10;
		int thirdnum = num % 100 / 10;
		int fourthNum = num % 10;
		
		int firstSum = firstNum * 10 + fourthNum;
		int secondSum = secondNum * 10 + thirdnum;
		
		if(firstSum == secondSum){
			System.out.println("Numbers are equal " + firstSum + "=" + secondSum);
		}else if (firstSum > secondSum){
			System.out.println("Bigger " + firstSum + ">" + secondSum);
		}else {
			System.out.println("Smaller " + firstSum + "<" + secondSum);
		}
		
	}

}
