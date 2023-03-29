package Switch;

import java.util.Scanner;

class Area {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("MENU:");
		System.out.println("1.Area of a Circle");
		System.out.println("2.Area of a Right Angled Triangle");
		System.out.println("3.Area of a Rectangle");
		System.out.println("4.Circumference of a Circle");
		System.out.println("5.Perimeter of a Square");

		System.out.println("Enter your choice:");
		int ch = sc.nextInt();

		switch (ch) {
		case 1:
			System.out.println("Enter radius:");
			float r = sc.nextFloat();
			float ac = 3.14f * r * r;
			System.out.println("Area:" + ac);
			break;

		case 2:
			System.out.println("Enter height and base:");
			float h = sc.nextFloat();
			float bs = sc.nextFloat();
			float art = 0.5f * h * bs;
			System.out.println("Area:" + art);
			break;

		case 3:
			System.out.println("Enter length and breadth:");
			int l = sc.nextInt();
			int b = sc.nextInt();
			int ar = l * b;
			System.out.println("Area:" + ar);
			break;

		case 4:
			System.out.println("Enter radius:");
			float R = sc.nextFloat();
			float C = 3.14f * 2f * R;
			System.out.println("Circumference:" + C);
			break;

		case 5:
			System.out.println("Enter side:");
			int X = sc.nextInt();
			int p = 4 * X;
			System.out.println("Perimeter:" + p);
			break;

		default:
			System.out.println("");
		}
		sc.close();
	}
}
