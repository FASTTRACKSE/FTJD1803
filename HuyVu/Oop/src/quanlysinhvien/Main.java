package quanlysinhvien;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static Scanner sr = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		String chon = null;
		boolean exit = false;
		QuanLySinhVien quanLySinhVien = new QuanLySinhVien();
		int sinhVienId;
		
		showMenu();
		while(true) {
			chon = sr.nextLine();
			switch (chon) {
			case "1":
				try {
					quanLySinhVien.add();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case "2":
				sinhVienId = quanLySinhVien.inputId();
                quanLySinhVien.edit(sinhVienId);
				break;
			case "3":
				sinhVienId = quanLySinhVien.inputId();
				quanLySinhVien.delete(sinhVienId);
				break;
			case "4":
				quanLySinhVien.sapDiemSinhVien();
				break;
			case "5":
				quanLySinhVien.sapXepTenSinhVien();
				break;
			case "6":
				System.out.println("Hien thi danh sach sinh vien");
				quanLySinhVien.show();
				break;
			case "0":
				System.out.println("Thoat");
				exit=true;
				break;
			default:
				break;
			}
			showMenu();
		}
	}
	
	public static void showMenu() {
		System.out.println("/****************************************/");
		System.out.println(" 1 : Them sinh vien ");
		System.out.println(" 2 : Cap nhap thong tin sinh vien theo ID ");
		System.out.println(" 3 : Xoa sinh vien theo ID ");
		System.out.println(" 4 : Sap xep diem sinh vien theo ten ");
		System.out.println(" 5 : Sap xep ten sinh vien theo ten ");
		System.out.println(" 6 : Hien thi danh sach sinh vien ");
		System.out.println(" 0 : Ket thuc chuong trinh ");
		System.out.println("/****************************************/");
		System.out.println("/*********** Moi ban chon lai ***********/");
		
	}

}
