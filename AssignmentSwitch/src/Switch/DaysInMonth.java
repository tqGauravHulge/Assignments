package Switch;

import java.util.Scanner;

public class DaysInMonth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int month = 0;
		int days;

		System.out.printf("Enter month number: ");
		month = sc.nextInt();

		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;

		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			break;

		case 2:
			days = 28;
			break;

		default:
			days = 0;
			break;
		}

		if (days != 0)
			System.out.printf("Number of days in %d month is: %d\n", month, days);
		else
			System.out.printf("You have entered an invalid month!!!\n");
		sc.close();
		;
	}
}
