package quanlysinhvien;

import java.io.Serializable;

public class SinhVien implements Serializable{

	private int id;
	private String ten;
	private byte tuoi;
	private String diaChi;
	
	private float diemTrungBinh;
	
	public SinhVien(){
		
	}

	public SinhVien(int id, String ten, byte tuoi, String diaChi, float diemTrungBinh) {
		super();
		this.id = id;
		this.ten = ten;
		this.tuoi = tuoi;
		this.diaChi = diaChi;
		this.diemTrungBinh = diemTrungBinh;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public byte getTuoi() {
		return tuoi;
	}

	public void setTuoi(byte tuoi) {
		this.tuoi = tuoi;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public float getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public void setDiemTrungBinh(float diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}
	
	
	
	
}
