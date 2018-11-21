package Hinh;

import java.util.Scanner;

public class HinhChuNhat  {
	private int dai;
	private int rong;
	

	public int getDai() {
		return dai;
	}

	public void setDai(int dai) {
		this.dai = dai;
	}

	public int getRong() {
		return rong;
	}

	public void setRong(int rong) {
		this.rong = rong;
	}

	public int getChuVi() {
		return (dai+rong)*2;
	}
	public int getDienTich() {
		return dai*rong;
	}

	

	

	public void getChuvi() {

		Scanner sc = new Scanner(System.in);
		dai = Integer.parseInt(sc.nextLine());
	
		rong = Integer.parseInt(sc.nextLine());

	}

	
	

	public void xuat() {
		System.out.println("HinhChuNhat");
		System.out.print("dai:");
		System.out.println(dai);
		System.out.print("rong:");
		System.out.println(rong);
		System.out.print("ChuVi :");
		System.out.println(this.getChuVi());
		System.out.print("DienTich :");
		System.out.println(this.getDienTich());
	}

	
	
	public HinhChuNhat(int dai, int rong) {
		super();
		this.dai = dai;
		this.rong = rong;
	}
		

}


