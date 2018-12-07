package lab5_2;

import java.util.Scanner;

public class KhachSan {
	private int soNgayTro;
	private String loaiP;
	private double giaP;
	Nguoi nguoi;
	
	public KhachSan() {
		
	}

	public KhachSan(int soNgayTro, String loaiP, double giaP, Nguoi nguoi) {
		super();
		this.soNgayTro = soNgayTro;
		this.loaiP = loaiP;
		this.giaP = giaP;
		this.nguoi = nguoi;
	}
	
	public void nhapThongTin(Scanner scanner) {
		nguoi = new Nguoi();
		this.nguoi.nhapThongTin(scanner);
		System.out.println("Nhap so ngay tro");
		this.soNgayTro = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Nhap loai phong :");
		this.loaiP = scanner.nextLine();
		
		System.out.println("Nhap gia phong :");
		this.giaP = scanner.nextDouble();
		scanner.nextLine();
	}
	
	public void hienThiThongtin() {
		nguoi.hienThiThongTin();
		System.out.println("So ngay tro :"+this.soNgayTro);
		System.out.println("Loai phong :"+this.loaiP);
		System.out.println("Gia phong : :"+this.giaP);
	}
	
	public double thanhTien() {
		return this.soNgayTro * this.giaP;
	}
	
	public Nguoi getKhach() {
		return this.nguoi;
	}
	
	public void xoa() {
		this.nguoi = new Nguoi();
		this.soNgayTro = 0;
		this.loaiP = null;
		this.giaP = 0;
	}
}
