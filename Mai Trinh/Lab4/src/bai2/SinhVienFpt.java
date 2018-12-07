 package bai2;

import java.util.Scanner;

abstract public class SinhVienFpt {
	private String hoTen;
	private String nganh;

	public SinhVienFpt() {
		super();
	}

	public SinhVienFpt(String hoTen, String nganh) {
		super();
		this.hoTen = hoTen;
		this.nganh = nganh;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getNganh() {
		return nganh;
	}

	public void setNganh(String nganh) {
		this.nganh = nganh;
	}

	abstract public double getDiem();
	
	
	public String getHocLuc() {
		if (this.getDiem()<5){
			return "Yeu";
		}
		if (this.getDiem()>=5 && this.getDiem()<6.5) {
			return "Trung binh";
		}
		if (this.getDiem()>=6.5 && this.getDiem()<7.5) {
			return "Kha";
		}
		if (this.getDiem()>=7.5 && this.getDiem()<9) {
			return "Gioi";
		}
		if (this.getDiem()>=9) {
			return "Xuat sac";
		}
		return "";
	}
	
	public void nhap() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Nhap ho ten sinh vien: ");
		this.hoTen= sc.nextLine();
		
		System.out.println("Nhap nganh sinh vien: ");
		this.nganh= sc.nextLine();
		
		
				
	}
	public void xuat() {
		System.out.println("Ho ten SV: "+this.hoTen+"	Nganh : "+this.nganh+"	Diem: "+this.getDiem()+"	Hoc luc: "+this.getHocLuc());
	}


}
