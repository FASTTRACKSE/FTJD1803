package assignment_6;

import java.util.Scanner;

import javax.naming.NameNotFoundException;

public class ThongTinCanBo {
	private String hoTen;
	private double heSoLuong;
	private int phuCap;
	
	Scanner scanner = new Scanner(System.in);
	
	public ThongTinCanBo() {
		
	}

	public ThongTinCanBo(String hoTen,double heSoLuong, int phuCap) {
		super();
		this.hoTen = hoTen;
		
		this.heSoLuong = heSoLuong;
		this.phuCap = phuCap;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	public int getPhuCap() {
		return phuCap;
	}

	public void setPhuCap(int phuCap) {
		this.phuCap = phuCap;
	}
	
	public void nhap() {
		
		String hoTen = nhapTen();
		double heSoLuong = nhapheSoLuong();
//		System.out.println("Nhap ho va ten : ");
//		this.hoTen = scanner.nextLine();
//		System.out.println("Nhap he so luong : ");
//		this.heSoLuong = Double.parseDouble(scanner.nextLine());
		
	}
	
	private String nhapTen() {
		System.out.println("Nhap ho va ten :");
		while(true) {
			try {
				hoTen = scanner.nextLine();
				if(hoTen.isEmpty()) {
					throw new NameNotFoundException();
				}else if (hoTen.length()>40) {
					throw new Exception();
				}
				return hoTen;
			} catch (NameNotFoundException e) {
				System.out.println("Ten khong duoc rong , vui long nhap lai :");
			} catch(Exception e) {
				System.out.println("Ten khong dai qua 40 ky tu , vui long nhap lai :");
			}
		}
	}
	
	private double nhapheSoLuong() {
		System.out.println("Nhap he so luong : ");
		while(true) {
			try {
				heSoLuong = Double.parseDouble(scanner.nextLine());
				if(heSoLuong<0.0) {
					throw new Exception();
				}
				return heSoLuong ;
			}catch(Exception e){
				System.out.println("He so luong nhap sai , vui long nhap lai :");
			}
		}
	}
	
	public double tinhLuong() {
		return 0;
	}

	@Override
	public String toString() {
		return "ThongTinCanBo [hoTen=" + hoTen + ", heSoLuong=" + heSoLuong + ", phuCap="
				+ phuCap + "]";
	}
}
