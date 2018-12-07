import java.util.Scanner;

public class NhanVien {
	 
	 String hoTen;
	 String phongBan;
	 int soNgayCong;
	 float heSoLuong;
	 float phuCap;
	 String chucVu;
	 float luong2;
	 
	public NhanVien() {
		super();
	}


	public NhanVien(String hoTen, String phongBan, int soNgayCong, int heSoLuong, float phuCap, String chucVu) {
		super();
		this.hoTen = hoTen;
		this.phongBan = phongBan;
		this.soNgayCong = soNgayCong;
		this.heSoLuong = heSoLuong;
		this.phuCap = phuCap;
		this.chucVu = chucVu;
	}


	public String getHoTen() {
		return hoTen;
	}


	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}


	public String getPhongBan() {
		return phongBan;
	}


	public void setPhongBan(String phongBan) {
		this.phongBan = phongBan;
	}


	public int getSoNgayCong() {
		return soNgayCong;
	}


	public void setSoNgayCong(int soNgayCong) {
		this.soNgayCong = soNgayCong;
	}


	public float getHeSoLuong() {
		return heSoLuong;
	}


	public void setHeSoLuong(int heSoLuong) {
		this.heSoLuong = heSoLuong;
	}


	public float getPhuCap() {
		return phuCap;
	}


	public void setPhuCap(float phuCap) {
		this.phuCap = phuCap;
	}


	public String getChucVu() {
		return chucVu;
	}


	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}
	 
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten giang vien: ");
		sc.nextLine();
		System.out.println("Nhap phong ban quan li: ");
		sc.nextLine();
		System.out.println("Nhap so ngay cong: ");
		this.soNgayCong= Integer.parseInt(sc.nextLine());
		System.out.println("Nhap he so luong: ");
		this.heSoLuong= Float.parseFloat(sc.nextLine());
	}
	 
}
