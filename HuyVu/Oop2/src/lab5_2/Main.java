package lab5_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<KhachSan> arrayListKhachSan ;
		int n ;
		System.out.println("Nhap so khach can nhap :");
		n = scanner.nextInt();
		scanner.nextLine();
		
		arrayListKhachSan = new ArrayList<>(n);
		
		KhachSan khachSan;
		
		for(int i = 0 ; i<n;i++) {
			khachSan = new KhachSan(); 
			khachSan.nhapThongTin(scanner);
			arrayListKhachSan.add(khachSan);
		}
		System.out.println("Danh sach khach tro :");
		for(int i = 0 ; i<arrayListKhachSan.size();i++) {
			arrayListKhachSan.get(i).hienThiThongtin();
		}
		String tim;
		System.out.println("Nhap so chung minh can tim cua khach hang can thanh toan");
		tim = scanner.nextLine();
		for(int i = 0 ; i < arrayListKhachSan.size();i++) {
			if(arrayListKhachSan.get(i).getKhach().getSoCMND().equalsIgnoreCase(tim)) {
				System.out.println("So tien phai thanh toan : "+arrayListKhachSan.get(i).thanhTien());
			}
		}
		
		

	}

}
