package lab5_2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {

	private String hoTen;
	private Date ngaySinh;
	private String soCMND;

	public Nguoi() {

	}

	public Nguoi(String hoTen, Date ngaySinh, String soCMND) {
		super();
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.soCMND = soCMND;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getSoCMND() {
		return soCMND;
	}

	public void setSoCMND(String soCMND) {
		this.soCMND = soCMND;
	}

	public void nhapThongTin(Scanner sr) {
		
		System.out.println("Nhap ho va ten :");
		this.hoTen = sr.nextLine();

		System.out.println("Nhap ngay sinh :");
		String ns = sr.nextLine();
		this.ngaySinh = chuyenStringDate(ns);

		System.out.println("Nhap so CMND :");
		this.soCMND = sr.nextLine();

	}

	public void hienThiThongTin() {
		System.out.println("Ho va ten :" +this.hoTen);
		System.out.println("Ngay sinh :" +this.ngaySinh);
		System.out.println("So chung minh nhan dan :" +this.soCMND);

	}

	public Date chuyenStringDate(String str) {
		Date ns = null;
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

		try {
			ns = simpleDateFormat.parse(str);
		}catch(Exception e) {
			System.out.println("Loi dinh dang thoi gian");
		}

		return ns;
	}


}
