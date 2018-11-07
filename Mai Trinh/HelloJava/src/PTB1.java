import java.util.Scanner;

public class PTB1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);

		System.out.println("Nhap a: ");
		int a = Integer.parseInt(sc.nextLine());

		System.out.println("Nhap b: ");
		int b = Integer.parseInt(sc.nextLine());

		if (a==0) {
			if (b==0) {
				System.out.println("Phuong trinh vo so nghiem");
			}
			else {
				System.out.println("Phuong trinh vo nghiem");
			}
		}
		else System.out.println("Nghiem cua phuong trinh la x = "+-b/a);

	}

}
// Ctril A + Ctril I 