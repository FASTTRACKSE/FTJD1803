package quanlydoibong;

import java.util.Scanner;

import javax.naming.NameNotFoundException;

public class HuanLuyenVien extends Nguoi{
	private String quocTich;
	private String cauLacBo;
	private int tuoi;
	private int phucap;
	
	Scanner scanner = new Scanner(System.in);
	
	public HuanLuyenVien() {
		
	}

	public HuanLuyenVien(String quocTich, String cauLacBo, int tuoi, int phucap) {
		super();
		this.quocTich = quocTich;
		this.cauLacBo = cauLacBo;
		this.tuoi = tuoi;
		this.phucap = phucap;
	}

	public String getQuocTich() {
		return quocTich;
	}

	public void setQuocTich(String quocTich) {
		this.quocTich = quocTich;
	}

	public String getCauLacBo() {
		return cauLacBo;
	}

	public void setCauLacBo(String cauLacBo) {
		this.cauLacBo = cauLacBo;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public int getPhucap() {
		return phucap;
	}

	public void setPhucap(int phucap) {
		this.phucap = phucap;
	}
	
	public void nhap() {
		super.nhap();
		String nhapQuocTich = nhapQuocTich();
		String nhapCauLacBo = nhapCauLacBo();
		int tuoi = nhapTuoi();
		int nhapPhuCap = nhapPhuCap();
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
	
	private int nhapPhuCap() {
		return phucap = (int) (getLuong()*20/100);
	}
	
	public double tinhLuong() {
		return (double)(this.getLuong()+this.getPhucap());
	}

	@Override
	public String toString() {
		return "HuanLuyenVien [quocTich=" + quocTich + ", cauLacBo=" + cauLacBo + ", tuoi=" + tuoi + ", phucap="
				+ phucap + "]";
	}
	
	public void xuat() {
		System.out.println("Ho va ten : "+this.getHoTen()+"Quoc tich :"+this.getQuocTich()+"Tuoi :"+this.getTuoi()+"Cau lac bo :"+this.getCauLacBo());
	}
	
}
