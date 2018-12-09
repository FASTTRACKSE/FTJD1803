package bai1;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		NhanVien nhanVien[]= new NhanVien[3];

			
		while(true) {
			menu();
			int chon = Integer.parseInt(scanner.nextLine());
			switch (chon) {
			case 1:
				for(int i = 0 ; i < 3 ; i++) {
					NhanVien nv = new NhanVien();
					nv.nhap();
					nhanVien[i]=nv;
				}
				break;
			case 2:
				for(NhanVien nv : nhanVien) {
					System.out.println(""+nv.toString());
				}
				break;
			case 3:
				System.exit(chon);
				break;
			default:
				break;
			}
		}
	}
	
	public static void menu() {
		System.out.println(">>       Chon menu      <<");
		System.out.println("+ ---------------------------------+");
		System.out.println("| 1 . Nhap danh sach sinh vien ");
		System.out.println("| 2 . Xuat thong tin danh sach sinh vien ");
		System.out.println("| 3 . Thoat ");
	}

}
