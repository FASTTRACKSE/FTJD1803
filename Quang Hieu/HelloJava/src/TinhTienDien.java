import java.util.Scanner;

public class TinhTienDien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		int b;
		System.out.println("vui long nhap so chu dien");
		Scanner sc = new Scanner(System.in);
		a = Integer.parseInt(sc.nextLine());
		if (a < 50) {
			System.out.println(a * 1000);
		}
		if (a > 50) {
			System.out.println(50 * 1000 + (a - 50) * 1200);
		}
	}
}
