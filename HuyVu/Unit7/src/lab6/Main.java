package lab6;

import java.util.ArrayList;
import java.util.Scanner;



public class Main {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		ArrayList<SinhVien> arrayListSinhVien = new ArrayList<>();
		System.out.println("Nhap so sinh vien can nhap :");
		int n = Integer.parseInt(scanner.nextLine());
		
		while(true) {

			menu();
			int chon = Integer.parseInt(scanner.nextLine());

			if(chon==1) {
				try {
					for(int i = 0 ; i < n ; i++) {
						SinhVien sv = new SinhVien();
						sv.nhap();
						arrayListSinhVien.add(sv);
					}
				}catch(Exception e) {
					e.printStackTrace();
				}
			}else if (chon==2) {
				System.out.println("Xuat danh sach sinh vien : ");
				for(SinhVien sv : arrayListSinhVien) {
					System.out.println("|"+arrayListSinhVien.toString());
				}
			}
		}

	}

	public static void menu() {
		System.out.println(">>       Chon Menu      <<");
		System.out.println("+ ---------------------------------+");
		System.out.println("| 1 . Nhap danh sach sinh vien ");
		System.out.println("| 2 . Xuat danh sach vua nhap ");
		System.out.println("| 3 . Thoat ");
	}

}
