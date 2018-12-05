package assignment_6;

import java.util.Scanner;

public class GiangVien extends ThongTinCanBo{

	private String khoa;
	private String trinhDo;
	private int soTietDay;
	
	private int chon;
	Scanner scanner = new Scanner(System.in);
	
	public GiangVien() {
	
	}

	public GiangVien(String khoa, String trinhDo, int soTietDay) {
		super();
		this.khoa = khoa;
		this.trinhDo = trinhDo;
		this.soTietDay = soTietDay;
	}

	public String getKhoa() {
		return khoa;
	}

	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}

	public String getTrinhDo() {
		return trinhDo;
	}

	public void setTrinhDo(String trinhDo) {
		this.trinhDo = trinhDo;
	}

	public int getSoTietDay() {
		return soTietDay;
	}

	public void setSoTietDay(int soTietDay) {
		this.soTietDay = soTietDay;
	}
	
	public void nhap() {
		super.nhap();
		
		System.out.println("Nhap khoa :");
		this.khoa = scanner.nextLine();
		
		int nhapTrinhDo = nhapTrinhDo();
		int nhapSoTietDay = nhapSoTietDay();
	}
	
	private int nhapTrinhDo() {
		System.out.println("Nhap trinh do -> Chon : 1 - cu nhan , 2 - thac si , 3 - tien si ");
		while(true) {
			try {
				chon = scanner.nextInt();
				if(chon==1) {
					trinhDo = "truong phong";
					this.setPhuCap(2000);
				}else if (chon==2) {
					trinhDo = "pho phong";
					this.setPhuCap(1000);
				}else if (chon==3) {
					trinhDo = "nhan vien";
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
	
	private int nhapSoTietDay() {
		System.out.println("Nhap so tiet day : ");
		while(true) {
			try {
				soTietDay = scanner.nextInt();
				if(soTietDay<0) {
					throw new Exception();
				}
				return soTietDay;
			}catch(Exception e) {
				System.out.println("Ban nhap so tiet day sai , vui long nhap lai :");
			}
		}
	}
	
	public double tinhLuong() {
		return (double)(this.getHeSoLuong()*730 + this.getPhuCap()+this.getSoTietDay()*45);
	}

	@Override
	public String toString() {
		return "GiangVien [hoTen="+getHoTen()+",khoa=" + khoa + ", trinhDo=" + trinhDo + ", soTietDay=" + soTietDay + ",luong="+tinhLuong()+"]";
	}
}
