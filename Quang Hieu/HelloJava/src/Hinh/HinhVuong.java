package Hinh;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat {
	public HinhVuong(int canh)
	{
	super(canh, canh);

	}
	public int getCanh()
	{
		return super.getDai();
	}
	public void xuat() {
		System.out.println("HinhVuong");
		
		System.out.print("ChuVi :");
		System.out.println(this.getChuVi());
		System.out.print("DienTich :");
		System.out.println(this.getDienTich());
	}

		
		 
		
		
	}
	

	
	
	
