package Bai4;

import java.util.Scanner;

public class SinhVienFpt {

	private String hoTen;
	private String nganh;
	private double diem;
	private String hocLuc;
	
	public SinhVienFpt() {
		
	}

	public SinhVienFpt(String hoTen, String nganh, double diem, String hocLuc) {
		super();
		this.hoTen = hoTen;
		this.nganh = nganh;
		this.diem = diem;
		this.hocLuc = hocLuc;
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

	public double getDiem() {
		return diem;
	}

	public void setDiem(double diem) {
		this.diem = diem;
	}

	public String getHocLuc() {
		if(diem>=9) {
			System.out.println(" Ho va ten : " +this.hoTen+ " Diem : " +this.diem+ " Hoc luc gioi "); 
		}else {
			
		}
		return hocLuc;
	}

	public void setHocLuc(String hocLuc) {
		this.hocLuc = hocLuc;
	}
	
	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhap ho va ten sinh vien :" );
		hoTen=scanner.nextLine();
		
		System.out.println("Nhap nganh :" );
		nganh=scanner.nextLine();
		
		System.out.println("Nhap diem :" );
		diem=scanner.nextDouble();
		
	}
	
	public void xuat() {
		System.out.println("Ho ten : " +this.hoTen+ " Nganh : " +this.nganh+ " Diem : "+this.diem);
	}
	
	public String xuatSinhVienHocLucGioi() {
		return getHocLuc();
	}
	
	
}
