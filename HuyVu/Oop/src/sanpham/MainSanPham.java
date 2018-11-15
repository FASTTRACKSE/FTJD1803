package sanpham;

import java.util.Scanner;

public class MainSanPham {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		SanPham sanPham[] = new SanPham[2];
		
		while(true) {
			menu();
			int choice = Integer.parseInt(scanner.nextLine());
			
			if(choice==1) {
				for(int i = 0;i<2;i++) {
					SanPham sp = new SanPham();
					sp.nhap();
					sanPham[i]=sp;
				}
			}else if(choice==2){
				System.out.println("Danh sach san pham : ");
				for(SanPham s:sanPham) {
					s.xuat();
				}
			}
		}
		
		

	}
	
	public static void menu() {
		System.out.println(" Moi ban chon so :");
		System.out.println(" 1 : Nhap san pham");
		System.out.println(" 2 : Xuat san pham");
	}

}
