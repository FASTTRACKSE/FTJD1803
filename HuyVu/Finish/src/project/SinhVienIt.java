package project;

import java.util.Scanner;

public class SinhVienIt extends SinhVien{
	private int diemHtml;
	private int diemCss;
	private int diemJava;
	
	Scanner scanner = new Scanner(System.in);
	
	public SinhVienIt() {
		
	}

	public SinhVienIt(int diemHtml, int diemCss, int diemJava) {
		super();
		this.diemHtml = diemHtml;
		this.diemCss = diemCss;
		this.diemJava = diemJava;
	}

	public int getDiemHtml() {
		return diemHtml;
	}

	public void setDiemHtml(int diemHtml) {
		this.diemHtml = diemHtml;
	}

	public int getDiemCss() {
		return diemCss;
	}

	public void setDiemCss(int diemCss) {
		this.diemCss = diemCss;
	}

	public int getDiemJava() {
		return diemJava;
	}

	public void setDiemJava(int diemJava) {
		this.diemJava = diemJava;
	}
	
	public void nhap() {
		super.nhap();
		int diemHtml = nhapDiemHtml();
		int diemCss = nhapDiemCss();
		int diemJava = nhapDiemJava();
	}
	
	private int nhapDiemHtml() {
		System.out.println("Nhap diem html :");
		while(true) {
			try {
				diemHtml = Integer.parseInt(scanner.nextLine());
				if(diemHtml<0 || diemHtml > 10) {
					throw new NumberFormatException();
				}return diemHtml;
			} catch (Exception e) {
				System.out.println("Khong hop le ! Vui long nhap lai ");
			}
		}
	}
	
	private int nhapDiemCss() {
		System.out.println("Nhap diem css :");
		while(true) {
			try {
				diemCss = Integer.parseInt(scanner.nextLine());
				if(diemCss<0 || diemCss > 10) {
					throw new NumberFormatException();
				}return diemCss;
			} catch (Exception e) {
				System.out.println("Khong hop le ! Vui long nhap lai ");
			}
		}
	}
	
	private int nhapDiemJava() {
		System.out.println("Nhap diem java :");
		while(true) {
			try {
				diemJava = Integer.parseInt(scanner.nextLine());
				if(diemJava<0 || diemJava > 10) {
					throw new NumberFormatException();
				}return diemJava;
			} catch (Exception e) {
				System.out.println("Khong hop le ! Vui long nhap lai ");
			}
		}
	}
	
	public float diemTB() {
		return (float)((this.getDiemHtml()+this.getDiemCss()+this.getDiemJava())/3);
	}

	@Override
	public String toString() {
		return "SinhVienIt [diemHtml=" + diemHtml + ", diemCss=" + diemCss + ", diemJava=" + diemJava + "]";
	}
	
	
}
