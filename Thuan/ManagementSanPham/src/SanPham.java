import java.util.Scanner;

public class SanPham {
	private String tenSanPham;
	private double donGia, giamGia;
	
	public SanPham() {
		
	}

	public SanPham(String tenSanPham, double donGia, double giamGia) {
		super();
		this.tenSanPham = tenSanPham;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}

	public String getTenSanPham() {
		return tenSanPham;
	}

	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public double getGiamGia() {
		return giamGia;
	}

	public void setGiamGia(double giamGia) {
		this.giamGia = giamGia;
	}
	private double getThueNhapKhau() {
		double thueNK;
		thueNK = (double) this.donGia * 0.1;
		return thueNK;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ten:");
		this.tenSanPham = sc.nextLine();
		System.out.println("nhap don gia:");
		this.donGia = sc.nextDouble();
		System.out.println("nhap giam gia:");
		this.giamGia = sc.nextDouble();
	}
	
	public void xuat() {
		System.out.printf(this.tenSanPham + "|" + this.donGia + "|" + this.giamGia + "|" + this.getThueNhapKhau());
	}
	
}
