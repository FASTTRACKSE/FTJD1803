package quanlydoibong;

import java.util.Scanner;

import javax.naming.NameNotFoundException;

public class Nguoi {
	
	private String hoTen;
	private double luong;
	private String cauLacBo;
	
	
	Scanner scanner = new Scanner(System.in);
	
	public Nguoi() {
		
	}

	public Nguoi(String hoTen, double luong,String cauLacBo) {
		super();
		this.hoTen = hoTen;
		this.luong = luong;
		this.cauLacBo = cauLacBo;
		
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public double getLuong() {
		return luong;
	}

	public void setLuong(double luong) {
		this.luong = luong;
	}
	
	public String getCauLacBo() {
		return cauLacBo;
	}

	public void setCauLacBo(String cauLacBo) {
		this.cauLacBo = cauLacBo;
	}

	public double tinhLuong() {
		return 0;
	}
	
	public void nhap() {
		
		String hoTen = nhapTen();
		double luong = nhapLuong();
		String cauLacBo = nhapCauLacBo();
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
	
	private double nhapLuong() {
		System.out.println("Nhap luong :");
		while(true) {
			try {
				luong = Double.parseDouble(scanner.nextLine());
				if(luong < 0 ) {
					throw new NumberFormatException();
				}
				return luong;
			}catch(Exception e) {
				System.out.println("Ban nhap luong khong hop le ! Vui long nhap lai ");
			}
		}
	}
	
	private String nhapCauLacBo() {
		System.out.println("Nhap cau lac bo :");
		while(true) {
			try {
				cauLacBo = scanner.nextLine();
				if(cauLacBo.isEmpty()) {
					throw new NameNotFoundException();
				}else if (cauLacBo.length()>40) {
					throw new Exception();

				}

				return cauLacBo;

			} catch (NameNotFoundException e) {
				System.out.println("Cau lac bo khong duoc rong , vui long nhap lai :");
			} catch(Exception e) {
				System.out.println("Cau lac bo khong dai qua 40 ky tu , vui long nhap lai :");
			}
		}
	}

	@Override
	public String toString() {
		return "Nguoi [hoTen=" + hoTen + ", luong=" + luong + "]";
	}
	
	public void xuat() {
		
	}
	

}
