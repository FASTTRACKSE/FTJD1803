import java.util.Scanner;

public class PTB2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);

		System.out.println("Nhap a: ");
		int a = Integer.parseInt(sc.nextLine());

		System.out.println("Nhap b: ");
		int b = Integer.parseInt(sc.nextLine());

		System.out.println("Nhap c: ");
		int c = Integer.parseInt(sc.nextLine());


		if (a==0) {
			if (b==0) {
				if (c==0) {
					System.out.println("Phuong trinh vo so nghiem");
				}
				else {
					System.out.println("Phuong trinh vo nghiem");
				}
			}
			else {
				System.out.println("Phuong trinh co nghiem x = "+ -c/b);
			}
		}
		else {
			int delta= b*b-4*a*c;
			if (delta <0) {
				System.out.println("Phuong trinh vo nghiem");
			}
			else if (delta==0) {
				int x = -b/(2*a);
				System.out.println("Phuong trinh co nghiem kep: "+x);
			}
			else {
				int x1 = (int) ((-b- Math.sqrt(delta))/(2*a));
				int x2 = (-b+ sqrt(delta))/(2*a);
				System.out.println("Phuong trinh co hai nghiem phan biet: "+x1+" va " +x2);
			}
		}
	}

	private static int sqrt(int delta) {
		// TODO Auto-generated method stub
		return 0;
	}

}
