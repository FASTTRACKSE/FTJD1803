import java.util.Scanner;

public class GiangVien {
	String hoTen;
	String khoa;
	int trinhDo;
	float phuCap;
	int soTiet;
	float heSoLuong;
	float luong1;
	
	public GiangVien() {
		super();
	}

	public GiangVien(String hoTen, String khoa, int trinhDo, float phuCap, int soTietDayTrongThang, int heSoLuong) {
		super();
		this.hoTen = hoTen;
		this.khoa = khoa;
		this.trinhDo = trinhDo;
		this.phuCap = phuCap;
		this.soTiet = soTiet;
		this.heSoLuong = heSoLuong;
	}

	public GiangVien(float luong) {
		super();
		this.luong1 = luong1;
	}
	
	
		public String getHoTen() {
		return hoTen;
	}

		
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}


	public String getKhoa() {
		return khoa;
	}


	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}


	public int getTrinhDo() {
		return trinhDo;
	}


	public void setTrinhDo(int trinhDo) {
		this.trinhDo = trinhDo;
	}


	public float getPhuCap() {
		return phuCap;
	}


	public void setPhuCap(float phuCap) {
		this.phuCap = phuCap;
	}


	public int getSoTiet() {
		return soTiet;
	}


	public void setSoTiet(int soTietDayTrongThang) {
		this.soTiet= soTietDayTrongThang;
	}


	public float getHeSoLuong() {
		return heSoLuong;
	}


	public void setHeSoLuong(float heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	
	public void phuCap() {
		
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten giang vien: ");
		sc.nextLine();
		System.out.println("Nhap khoa: ");
		sc.nextLine();
		System.out.println("Nhap trinh do hoc van:  ");
		this.trinhDo= Integer.parseInt(sc.nextLine());
		System.out.println("Nhap so tiet day trong thang: ");
		this.soTiet= Integer.parseInt(sc.nextLine());
		System.out.println("Nhap he so luong: ");
		this.heSoLuong= Float.parseFloat(sc.nextLine());
	}
	
	
	public double getLuong() {
		return  this.heSoLuong*730+ +this.soTiet*45;  
	}


	

	
	
}
