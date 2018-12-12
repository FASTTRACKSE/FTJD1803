package project;

import java.util.Scanner;

public class SinhVienBiz extends SinhVien{
	private int diemSale;
	private int diemMarketing;
	
	Scanner scanner = new Scanner(System.in);
	
	public SinhVienBiz() {
		
	}

	public SinhVienBiz(int diemSale, int diemMarketing) {
		super();
		this.diemSale = diemSale;
		this.diemMarketing = diemMarketing;
	}

	public int getDiemSale() {
		return diemSale;
	}

	public void setDiemSale(int diemSale) {
		this.diemSale = diemSale;
	}

	public int getDiemMarketing() {
		return diemMarketing;
	}

	public void setDiemMarketing(int diemMarketing) {
		this.diemMarketing = diemMarketing;
	}
	
	public void nhap() {
		super.nhap();
		int diemSale = nhapDiemSale();
		int diemMarketing = nhapDiemMarketing();
	}
	
	private int nhapDiemSale() {
		System.out.println("Nhap diem sale :");
		while(true) {
			try {
				diemSale = Integer.parseInt(scanner.nextLine());
				if(diemSale<0 || diemSale > 10) {
					throw new NumberFormatException();
				}return diemSale;
			} catch (Exception e) {
				System.out.println("Khong hop le ! Vui long nhap lai ");
			}
		}
	}
	
	private int nhapDiemMarketing() {
		System.out.println("Nhap diem Marketing :");
		while(true) {
			try {
				diemMarketing = Integer.parseInt(scanner.nextLine());
				if(diemMarketing<0 || diemMarketing > 10) {
					throw new NumberFormatException();
				}return diemSale;
			} catch (Exception e) {
				System.out.println("Khong hop le ! Vui long nhap lai ");
			}
		}
	}
	
	public float diemTB() {
		return (float)((this.getDiemSale()+this.getDiemMarketing())/3);
	}

	@Override
	public String toString() {
		return "SinhVienBiz [diemSale=" + diemSale + ", diemMarketing=" + diemMarketing + "]";
	}
	
	
}
