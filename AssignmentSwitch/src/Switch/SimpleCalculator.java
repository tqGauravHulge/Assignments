package Switch;

import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1.Addition:");
		System.out.println("2.Substraction:");
		System.out.println("3.Multiplication:");
		System.out.println("4.Division:");

		System.out.println("Enter two numbers:");
		float num1 = sc.nextFloat();
		float num2 = sc.nextFloat();
		float result;

		System.out.println("Enter your choice:");
		int ch = sc.nextInt();

		switch (ch) {
		case 1: {
			result = num1 + num2;
			System.out.println("Addition:" + result);
			break;
		}

		case 2: {
			result = num1 - num2;
			System.out.println("Substraction:" + result);
			break;
		}

		case 3: {
			result = num1 * num2;
			System.out.println("Multipication:" + result);
			break;
		}

		case 4: {
			result = num1 / num2;
			System.out.println("Division:" + result);
			break;
		}

		default:
			System.out.println("Invalid Choice");

		}

		sc.close();
	}
}
