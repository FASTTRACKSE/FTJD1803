package fasttrackse.vn.edu.model;

import java.sql.Date;

public class SinhVien {
	private int maSinhVien;
	private String hoTen;
	private Date ngaySinh;
	private int diemTb;
	private int maLop;
	
	public int getMaSinhVien() {
		return maSinhVien;
	}
	public void setMaSinhVien(int maSinhVien) {
		this.maSinhVien = maSinhVien;
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
	public int getDiemTb() {
		return diemTb;
	}
	public void setDiemTb(int diemTb) {
		this.diemTb = diemTb;
	}
	public int getMaLop() {
		return maLop;
	}
	public void setMaLop(int maLop) {
		this.maLop = maLop;
	}
	@Override
	public String toString() {
		return "SinhVien [maLop=" + maLop + "]";
	}
	
	
	
}
