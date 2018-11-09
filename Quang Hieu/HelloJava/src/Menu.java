import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		while (true)
			{
		int q;
		System.out.println("vui long nhap so");
		Scanner sc = new Scanner(System.in);
		q = Integer.parseInt(sc.nextLine());

		switch (q) {

		case 1: {

			int a;
            int b;
			int x;

			a = Integer.parseInt(sc.nextLine());
			b = Integer.parseInt(sc.nextLine());
			if (a == 0) {
				if (b == 0) {
					System.out.println("phuong trinh vo so nghiem");
				} else {
					System.out.println("phuong trinh vo ngihem");
				}

			}

			else {
				x = -b / a;
				System.out.println(x);

			}
			System.out.println("ket thuc");
			break;

		}

		case 2: {
			int a;
			int b;
			int c;
			for (a = 2; a <= 9; a++) {

				for (b = 1; b <= 9; b++) {

					c = a * b;
					System.out.print(b + " x " + a + " = " + c);
					if (c <= 9) {
						System.out.print("   ");
					} else {
						System.out.print("  ");
					}

				}
				System.out.println(" ");
			}
			System.out.println("ket thuc");
			break;
		}

		case 3: {
			int a;
			int b;
			System.out.println("vui long nhap so chu dien");
			a = Integer.parseInt(sc.nextLine());
			if (a < 50) {
				System.out.println(a * 1000);
			}
			if (a > 50) {
				System.out.println(50 * 1000 + (a - 50) * 1200);
			}
			System.out.println("ket thuc");
			break;
		}

		}
			}

	}
}
