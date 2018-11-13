package vonglap;

import java.util.Scanner;

public class Mang {

	public static void main(String[] args) {
		Mang();
	}

	public static void Mang() {

		SinhVien a[]= new SinhVien[2];

		String hoten;
		int diem = 0;
		String hocLuc = null;

		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < 2 ;i++) {
			a[i] = new SinhVien();
			System.out.println("Nhap ho va ten :");
			hoten = scanner.nextLine();
			a[i].setHoten(hoten);
			System.out.println("Nhap diem vao :");
			diem = scanner.nextInt();
			a[i].setDiem(diem);
			scanner.nextLine();

			if(diem >=9 ) {
				hocLuc = "xuat sac";
				a[i].setHocLuc(hocLuc);

			}else if (7 <= diem && diem < 9) {

				hocLuc = "G";
				a[i].setHocLuc(hocLuc);

			}else if (6.5 <= diem && diem < 7 ) {
				hocLuc = "K";
				a[i].setHocLuc(hocLuc);

			}else if(5 <= diem && diem < 6.5) {
				hocLuc = "Tb";
				a[i].setHocLuc(hocLuc);

			}else {
				hocLuc = "Y";
				a[i].setHocLuc(hocLuc);


			}
		}
		for(int i = 0 ; i < 2; i++) {
			for(int j = i + 1 ; j < 2 ; j++) {
				if(a[i].getDiem()>a[j].getDiem()) {
					SinhVien sv = new SinhVien();
						sv = a[i];
						a[i]=a[j];
						a[j]=sv;
				}
			}
		}
		System.out.println("Danh sach sinh vien sau khi sap xep :");
		for (int i = 0; i <2; i++) {

			System.out.println("Ho va ten : " +a[i].getHoten());
			System.out.println("Diem : " +a[i].getDiem());
			System.out.println("Hoc luc : " +a[i].getHocLuc());

		}


	}


}


