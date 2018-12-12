package project;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;





public class Main {

	public static Scanner sr = new Scanner(System.in);

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
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
					quanLySinhVien.nhap();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case "2":
				
				break;
			case "3":
				
				break;
			case "4":
				
				break;
			case "5":
				
				break;
			case "6":
				
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
