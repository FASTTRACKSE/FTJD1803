package bai2;

import java.util.Scanner;

public class SinhVienIT extends SinhVienFpt {
	public double diemJava;
	public double diemHTML;
	public double diemCSS;
	
	
	public SinhVienIT() {
		super();
	}


	public SinhVienIT(double diemJava, double diemHTML, double diemCSS) {
		super();
		this.diemJava = diemJava;
		this.diemHTML = diemHTML;
		this.diemCSS = diemCSS;
	}


	public double getDiemJava() {
		return diemJava;
	}


	public void setDiemJava(double diemJava) {
		this.diemJava = diemJava;
	}


	public double getDiemHTML() {
		return diemHTML;
	}


	public void setDiemHTML(double diemHTML) {
		this.diemHTML = diemHTML;
	}


	public double getDiemCSS() {
		return diemCSS;
	}


	public void setDiemCSS(double diemCSS) {
		this.diemCSS = diemCSS;
	}
		
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		
		super.nhap();
		
				
		System.out.println("Nhap diem Java: ");
		this.diemJava= Integer.parseInt(sc.nextLine());
		
		System.out.println("Nhap diem HTML: ");
		this.diemHTML = Integer.parseInt(sc.nextLine());
		
		System.out.println("Nhap diem CSS: ");
		this.diemCSS = Integer.parseInt(sc.nextLine());
	}
	@Override
	public double getDiem() {
		// TODO Auto-generated method stub
		return (2*this.diemJava+this.diemHTML+this.diemCSS)/4;
	}

}
