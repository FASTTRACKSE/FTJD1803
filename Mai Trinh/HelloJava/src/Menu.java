import java.util.Scanner;

public class Menu {

	public void PTB1() {
		Scanner s= new Scanner (System.in);
		System.out.println("Nhap a: ");
		int a = Integer.parseInt(s.nextLine());

		System.out.println("Nhap b: ");
		int b = Integer.parseInt(s.nextLine());

		if (a==0) {
			if (b==0) {
				System.out.println("Phuong trinh vo so nghiem");
			}
			else {
				System.out.println("Phuong trinh vo nghiem");
			}
		}
		else System.out.println("Nghiem cua phuong trinh la x = "+(float)-b/a);
	}

	public void PTB2() {
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
				System.out.println("Phuong trinh co nghiem x = "+ (float)-c/b);
			}
		}
		else {
			int delta= b*b-4*a*c;
			if (delta <0) {
				System.out.println("Phuong trinh vo nghiem");
			}
			else if (delta==0) {
				float x = -b/(2*a);
				System.out.println("Phuong trinh co nghiem kep: "+x);
			}
			else {
				float x1 = (int) ((-b- Math.sqrt(delta))/(2*a));
				float x2 = (int) ((-b+ Math.sqrt(delta))/(2*a));
				System.out.println("Phuong trinh co hai nghiem phan biet: "+x1+" va " +x2);
			}
		}
	}

	public void TinhTienDien() {
		float tien;

		System.out.print("Nhap so dien su dung cua thang: ");
		Scanner sc = new Scanner(System.in);
		int soDien = Integer.parseInt(sc.nextLine());

		if (0< soDien && soDien <50) {
			tien= soDien*1000;
			System.out.println("Tien thang nay la: "+ tien );

		}
		else if (soDien>= 50){
			tien = 50*1000+(soDien-50)*1200;
			System.out.println("Tien thang nay la: "+ tien);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0;
		while(i==0) {
			System.out.println("+--------------------------------------+");
			System.out.println("1. Giai phuong trinh bac nhat");
			System.out.println("2. Giai phuong trinh bac hai");
			System.out.println("3. Tinh tien dien");
			System.out.println("4. Ket thuc");
			System.out.println("+--------------------------------------+");
			System.out.print("Nhap n: "); 
			Scanner sc = new Scanner(System.in);
			int n = Integer.parseInt(sc.nextLine());
			Menu a= new Menu();
			switch (n) {
			case 1:
				System.out.println("Giai phuong trinh bac nhat");
				a.PTB1();
				break;

			case 2:
				System.out.println("Giai phuong trinh bac hai");
				a.PTB2();
				break;

			case 3: 
				System.out.println("Tinh tien dien");
				a.TinhTienDien();
				break;

			case 4:
				i=1;
				System.out.println("Ket thuc!!!");
				break;
			}

		}

	}
}


