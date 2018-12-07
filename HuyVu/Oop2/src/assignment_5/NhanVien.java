package assignment_5;

import java.util.Scanner;

public class NhanVien extends ThongTinCanBo{
	private String phongBan;
	private String chucVu;
	private int soNgayCong;
	
	private int chon;
	Scanner scanner = new Scanner(System.in);
	
	public NhanVien() {
		
	}

	public NhanVien(String phongBan, String chucVu, int soNgayCong) {
		super();
		this.phongBan = phongBan;
		this.chucVu = chucVu;
		this.soNgayCong = soNgayCong;
	}

	public String getPhongBan() {
		return phongBan;
	}

	public void setPhongBan(String phongBan) {
		this.phongBan = phongBan;
	}

	public String getChucVu() {
		return chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

	public int getSoNgayCong() {
		return soNgayCong;
	}

	public void setSoNgayCong(int soNgayCong) {
		this.soNgayCong = soNgayCong;
	}
	
	public void nhap() {
		super.nhap();
		
		System.out.println("Nhap phong ban :");
		this.phongBan = scanner.nextLine();
		
		System.out.println("Nhap chuc vu -> Chon : 1 - truong phong , 2 - pho phong , 3 - nhan vien ");
		this.chon = scanner.nextInt();
		
		if(chon==1) {
			chucVu = "truong phong";
			this.setPhuCap(2000);
		}else if (chon==2) {
			chucVu = "pho phong";
			this.setPhuCap(1000);
		}else if (chon==3) {
			chucVu = "nhan vien";
			this.setPhuCap(500);
		}
		System.out.println("Nhap so ngay cong :");
		this.soNgayCong = scanner.nextInt();
	}

	public double tinhLuong() {
		return (double)(this.getHeSoLuong()*730 + this.getPhuCap()+this.getSoNgayCong()*30);
	}
	
	@Override
	public String toString() {
		return "NhanVien [hoTen="+getHoTen()+",phongBan=" + phongBan + ", chucVu=" + chucVu + ", soNgayCong=" + soNgayCong + "]";
	}
	
	
	
}
