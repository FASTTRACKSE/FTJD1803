package bai2;

import java.util.Scanner;

public class SinhVienBiz extends SinhVienFpt {
	public double diemMarketing;
	public double diemSales;
	
	public SinhVienBiz() {
		super();
	}
	
	public SinhVienBiz(double diemMarketing, double diemSales) {
		super();
		this.diemMarketing = diemMarketing;
		this.diemSales = diemSales;
	}
	
	public double getDiemMarketing() {
		return diemMarketing;
	}

	public void setDiemMarketing(double diemMarketing) {
		this.diemMarketing = diemMarketing;
	}

	public double getDiemSales() {
		return diemSales;
	}

	public void setDiemSales(double diemSales) {
		this.diemSales = diemSales;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		
		super.nhap();
		
				
		System.out.println("Nhap diem Marketing: ");
		this.diemMarketing= Integer.parseInt(sc.nextLine());
		
		System.out.println("Nhap diem Sale: ");
		this.diemSales = Integer.parseInt(sc.nextLine());
		
		
	}
	
	@Override
	public double getDiem() {
		// TODO Auto-generated method stub
		return (2*this.diemMarketing+this.diemSales)/3;
	}

}
