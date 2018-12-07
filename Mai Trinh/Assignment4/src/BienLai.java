import java.util.Scanner;

public class BienLai extends KhachHang {
	
	int soCu;
	int soMoi;
	double thanhTien;
	
	public BienLai() {
		super();
	}

	public BienLai(int soCu, int soMoi, double thanhTien) {
		super();
		this.soCu = soCu;
		this.soMoi = soMoi;
		this.thanhTien = thanhTien;
	}

	public int getSoCu() {
		return soCu;
	}

	public void setSoCu(int soCu) {
		this.soCu = soCu;
	}

	public int getSoMoi() {
		return soMoi;
	}

	public void setSoMoi(int soMoi) {
		this.soMoi = soMoi;
	}

	public double getThanhTien() {
		return thanhTien;
	}

	public void setThanhTien(double thanhTien) {
		this.thanhTien = thanhTien;
	}
	
	public double tinhTien() {
		return (this.soMoi-this.soCu)*750;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.println("Nhap chi so cu: ");
		this.soCu= Integer.parseInt(sc.nextLine());
		
		System.out.println("Nhap chi so moi: ");
		this.soMoi= Integer.parseInt(sc.nextLine());
	}
	
	public void xuat() {
		 super.xuat();
		System.out.println("Chi so cu: "+this.getSoCu()+"\nChi so  moi: "+this.getSoMoi()+"\nSo tien phai tra: "+this.tinhTien());
		
	}
	

	
	
}
