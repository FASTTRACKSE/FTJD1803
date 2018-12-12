package quanlydoibong;

import java.util.Scanner;

import javax.naming.NameNotFoundException;

public class HuanLuyenVien extends Nguoi{
	private String quocTich;
	private int tuoi;
	private double phucap;

	Scanner scanner = new Scanner(System.in);

	public HuanLuyenVien() {

	}

	public HuanLuyenVien(String quocTich, String cauLacBo, int tuoi, double phucap) {
		super();
		this.quocTich = quocTich;

		this.tuoi = tuoi;
		this.phucap = phucap;
	}

	public String getQuocTich() {
		return quocTich;
	}

	public void setQuocTich(String quocTich) {
		this.quocTich = quocTich;
	}


	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public double getPhucap() {
		return phucap;
	}

	public void setPhucap(double phucap) {
		this.phucap = phucap;
	}

	public void nhap() {
		super.nhap();
		String nhapQuocTich = nhapQuocTich();
		int tuoi = nhapTuoi();
		double nhapPhuCap = nhapPhuCap();
	}

	private String nhapQuocTich() {
		System.out.println("Nhap quoc tich :");
		while(true) {
			try {
				quocTich = scanner.nextLine();
				if(quocTich.isEmpty()) {
					throw new NameNotFoundException();
				}else if (quocTich.length()>40) {
					throw new Exception();

				}

				return quocTich;

			} catch (NameNotFoundException e) {
				System.out.println("Quoc tich khong duoc rong , vui long nhap lai :");
			} catch(Exception e) {
				System.out.println("Quoc tich khong dai qua 40 ky tu , vui long nhap lai :");
			}
		}
	}

	private int nhapTuoi() {
		System.out.println("Nhap tuoi :");
		while(true) {
			try {
				tuoi = Integer.parseInt(scanner.nextLine());
				if(tuoi<0||tuoi>100) {
					throw new NumberFormatException();
				}
				return tuoi;
			}catch(Exception e) {
				System.out.println("Nhap tuoi khong hop le , vui long nhap lai :");
			}
		}
	}

	private double nhapPhuCap() {
		return (phucap=getLuong()*20/100);
	}

	public double tinhLuong() {
		return (double)(this.getLuong()+this.getPhucap());
	}

	@Override
	public String toString() {
		return "HuanLuyenVien [hoTen="+this.getHoTen()+",quocTich=" + quocTich + ",cauLacBo="+this.getCauLacBo()+", tuoi=" + tuoi + ", phucap=" + phucap + "]";
	}

	public void xuat() {
		System.out.println("Ho va ten : " + this.getHoTen() + " Quoc tich : " + this.getQuocTich() + " Tuoi : " + this.getTuoi() + " Cau lac bo :" +  this.getCauLacBo());
	}

}
