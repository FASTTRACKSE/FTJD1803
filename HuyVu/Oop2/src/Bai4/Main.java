package Bai4;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		SinhVienFpt sinhVienFpt[]= new SinhVienFpt[3];

		while(true) {
			menu();
			int choice = Integer.parseInt(scanner.nextLine());
			switch (choice) {

			case 1:

				for(int i = 0 ; i < 3 ; i++) {
					SinhVienFpt sv = new SinhVienFpt();
					sv.nhap();
					sinhVienFpt[i]=sv;
				}
				break;

			case 2:
				System.out.println("Danh sach sinh vien : ");
				for(SinhVienFpt s:sinhVienFpt) {
					s.xuat();
				}
				break;

			case 3:
				System.out.println("Danh sach sinh vien gioi : ");
				for(SinhVienFpt s:sinhVienFpt) {
					s.xuatSinhVienHocLucGioi();
				}
				break;

			case 4:
				System.out.println("Sap xep danh sach sinh vien theo diem : ");
				for(int i = 0; i < 3; i ++){
		            for(int j = i + 1; j < 3 ; j ++){
		                if(sinhVienFpt[i].getDiem() > sinhVienFpt[j].getDiem()){
		                    SinhVienFpt temp = new SinhVienFpt();
		                    temp = sinhVienFpt[i];
		                    sinhVienFpt[i] = sinhVienFpt[j];
		                    sinhVienFpt[j] = temp;
		                }
		            }
		            System.out.println("Diem cua sinh vien :"+sinhVienFpt[i].getDiem());
		        }
				
				break;
			case 5:
				System.exit(choice);
			default:
				break;
			}
		}

	}

	public static void menu() {
		System.out.println(">>       Danh sach sinh vien      <<");
		System.out.println("+ ---------------------------------+");
		System.out.println("| 1 . Nhap danh sach sinh vien ");
		System.out.println("| 2 . Xuat thong tin danh sach sinh vien ");
		System.out.println("| 3 . Xuat danh sach sinh vien co hoc luc gioi");
		System.out.println("| 4 . Sap xep sinh vien theo diem ");
		System.out.println("| 5 . Thoat ");
	}

}
