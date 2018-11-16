package sanpham;

import java.util.Scanner;

public class SanPham {

	private String tenSanPham;
	private double donGia;
	private double giamGia;
	private double thueNhapKhau;
	public void nhap() {

		Scanner sr = new Scanner(System.in);

		System.out.println("Nhap ten san pham : ");
		this.tenSanPham = sr.nextLine();

		System.out.println("Nhap don gia : ");
		this.donGia = sr.nextDouble();

		System.out.println("Nhap giam gia : ");
		this.giamGia = sr.nextDouble();
		
		this.donGia = Math.round((donGia * giamGia)/100);
	}
	
	public double getThueNhapKhau() {
		
		thueNhapKhau = (double)(donGia*10/100);
		return thueNhapKhau;
	}

	public void xuat() {

		System.out.print(" Ten san pham :" +this.tenSanPham +"\n");
		System.out.print(" Don gia : " +this.donGia+ "\n");
		System.out.print(" Giam gia : " +this.giamGia+ "\n");
		System.out.print(" Thue nhap khau : " +this.getThueNhapKhau()+ "\n");
	}
}
