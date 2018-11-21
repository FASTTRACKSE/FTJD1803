package hinh;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhap chieu dai :");
		double dai = scanner.nextDouble();
		
		System.out.println("Nhap chieu rong :");
		double rong = scanner.nextDouble();
		
		System.out.println("Nhap canh hinh vuong :");
		double canh = scanner.nextDouble();
		
		ChuNhat cn = new ChuNhat(dai,rong);
		ChuNhat vu = new Vuong(canh);
		
		cn.xuat();
		vu.xuat();
		
	}

}
