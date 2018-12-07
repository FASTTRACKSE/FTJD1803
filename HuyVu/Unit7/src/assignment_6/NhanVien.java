package assignment_6;

import java.util.Scanner;

public class NhanVien extends ThongTinCanBo{
	private String phongBan;
	private String chucVu;
	private int soNgayCong;


	Scanner scanner = new Scanner(System.in);
	private int chon;

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
		int nhapChucVu = nhapChucVu();
		int nhapSoNgayCong = nhapSoNgayCong();

	}

	private int nhapChucVu() {
		System.out.println("Nhap chuc vu -> Chon : 1 - truong phong , 2 - pho phong , 3 - nhan vien ");
		while(true) {
			try {
				chon = scanner.nextInt();
				if(chon==1) {
					chucVu = "truong phong";
					this.setPhuCap(2000);
				}else if (chon==2) {
					chucVu = "pho phong";
					this.setPhuCap(1000);
				}else if (chon==3) {
					chucVu = "nhan vien";
					this.setPhuCap(500);
				}else if(chon>=4) {
					throw new Exception();
				}
				return chon;
			}catch(Exception e) {
				System.out.println("Ban da chon sai , vui long chon lai : ");
			}

		}
	}
	
	private int nhapSoNgayCong() {
		System.out.println("Nhap so tiet day : ");
		while(true) {
			try {
				soNgayCong = scanner.nextInt();
				if(soNgayCong<0) {
					throw new Exception();
				}
				return soNgayCong;
			}catch(Exception e) {
				System.out.println("Ban nhap so ngay cong sai , vui long nhap lai :");
			}
		}
	}

	public double tinhLuong() {
		return (double)(this.getHeSoLuong()*730 + this.getPhuCap()+this.getSoNgayCong()*30);
	}

	@Override
	public String toString() {
		return "NhanVien [hoTen=" + getHoTen() + ", phongBan=" + phongBan + ", chucVu=" + chucVu + ", soNgayCong=" + soNgayCong + ",luong="+tinhLuong()+"]";
	}
}
