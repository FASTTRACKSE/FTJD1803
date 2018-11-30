package assignment_5;

import java.util.Scanner;

public class ThongTinCanBo {
	private String hoTen;
	private String loaiCanBo;
	private double heSoLuong;
	private int phuCap;
	
	Scanner scanner = new Scanner(System.in);
	
	public ThongTinCanBo() {
		
	}

	public ThongTinCanBo(String hoTen, String loaiCanBo, double heSoLuong, int phuCap) {
		super();
		this.hoTen = hoTen;
		this.loaiCanBo = loaiCanBo;
		this.heSoLuong = heSoLuong;
		this.phuCap = phuCap;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getLoaiCanBo() {
		return loaiCanBo;
	}

	public void setLoaiCanBo(String loaiCanBo) {
		this.loaiCanBo = loaiCanBo;
	}

	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	public int getPhuCap() {
		return phuCap;
	}

	public void setPhuCap(int phuCap) {
		this.phuCap = phuCap;
	}
	
	public void nhap() {
		
		System.out.println("Nhap ho va ten : ");
		this.hoTen = scanner.nextLine();
		System.out.println("Nhap he so luong : ");
		this.heSoLuong = scanner.nextDouble();
		
	}
	public double tinhLuong() {
		return 0;
	}

	@Override
	public String toString() {
		return "ThongTinCanBo [hoTen=" + hoTen + ", loaiCanBo=" + loaiCanBo + ", heSoLuong=" + heSoLuong + ", phuCap="
				+ phuCap + ", scanner=" + scanner + "]";
	}
	
	
}
