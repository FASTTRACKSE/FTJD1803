package quanlysinhvien;

import java.util.Scanner;

public class Main {

	public static Scanner sr = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		String chon = null;
		boolean exit = false;
		int studentId;
		
		showMenu();
		while(true) {
			chon = sr.nextLine();
			switch (chon) {
			case "1":
				System.out.println("Them sinh vien");
				break;
			case "2":
				System.out.println("Them sinh vien");
				break;
			case "3":
				System.out.println("Them sinh vien");
				break;
			case "4":
				System.out.println("Them sinh vien");
				break;
			case "5":
				System.out.println("Them sinh vien");
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
		System.out.println(" 4 : Sap xep sinh vien theo ten ");
		System.out.println(" 5 : Hien thi danh sach sinh vien ");
		System.out.println(" 6 : Ket thuc chuong trinh ");
		System.out.println("/****************************************/");
		System.out.println("/*********** Moi ban chon lai ***********/");
		
	}

}
