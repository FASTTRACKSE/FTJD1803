package bai1;

import java.util.Scanner;

public class NhanVien {
	private String hoTen;
	private String email;
	private String soDienThoai;
	private String cmnd;
	
	Scanner scanner = new Scanner(System.in);
	
	public NhanVien(){
		
	}

	public NhanVien(String hoTen, String email, String soDienThoai, String cmnd) {
		super();
		this.hoTen = hoTen;
		this.email = email;
		this.soDienThoai = soDienThoai;
		this.cmnd = cmnd;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getCmnd() {
		return cmnd;
	}

	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}
	
	public void nhap() {
		
		System.out.println("Nhap ten :");
		hoTen = scanner.nextLine();
		
		System.out.println("Nhap email :");
		email = scanner.nextLine();
		
		String patternEmail = "/^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$/";
		if(email.matches(patternEmail)) {
			System.out.println("Ban da nhap dung dinh dang email");
		}else {
			System.out.println("Ban da nhap khong dung dinh dang email");
		}
		
		System.out.println("Nhap so dien thoai :");
		soDienThoai = scanner.nextLine();
		
		String patternSDT = "0[0-9]{9,10} ";
		if(soDienThoai.matches(patternSDT)) {
			System.out.println("Ban da nhap dung dinh dang so dien thoai");
		}else {
			System.out.println("Ban da nhap khong dung dinh dang so dien thoai");
		}
		
		System.out.println("Nhap so cmnd :");
		cmnd = scanner.nextLine();
		
		String patternCMND = "[0-9]{9}";
		if(soDienThoai.matches(patternCMND)) {
			System.out.println("Ban da nhap dung dinh dang so cmnd");
		}else {
			System.out.println("Ban da nhap khong dung dinh dang so cmnd");
		}
	}
	
	

	@Override
	public String toString() {
		return "NhanVien [hoTen=" + hoTen + ", email=" + email + ", soDienThoai=" + soDienThoai + ", cmnd=" + cmnd
				+ "]";
	}
	
	
}
