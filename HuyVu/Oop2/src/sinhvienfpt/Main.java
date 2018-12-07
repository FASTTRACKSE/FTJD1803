package sinhvienfpt;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ten : ");
		String hoTen = scanner.nextLine();
		
		System.out.println("Nhap nganh : ");
		String nganh = scanner.nextLine();
		
		System.out.println("Nhap diem : ");
		double diem = scanner.nextDouble();
		
		
		SinhVienFpt sv = new SinhVienFpt() {
			
			@Override
			double getDiem() {
				
				return 0;
			}
		};
		sv.xuat();

	}

}
