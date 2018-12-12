package project;

import java.io.Serializable;
import java.util.Scanner;

import javax.naming.NameNotFoundException;

public class SinhVien implements Serializable{
	private int id;
	private String ten;
	private int tuoi;
	private String diaChi;
	
	Scanner scanner = new Scanner(System.in);
	
	public SinhVien() {
		
	}

	public SinhVien(int id, String ten, int tuoi, String diaChi) {
		super();
		this.id = id;
		this.ten = ten;
		this.tuoi = tuoi;
		this.diaChi = diaChi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
	public void nhap() {
		
		int id = nhapId();
		String ten = nhapTen();
		int tuoi = nhapTuoi();
		String diaChi = nhapDiaChi();
	}
	
	private int nhapId() {
		String s;
		System.out.println("Nhap ma sinh vien :");
		while(true) {
			try {
				id = Integer.parseInt(scanner.nextLine());
				s = String.valueOf(id);
				if(s.equals(null)) {
					throw new Exception();
				}
				return id;
			}catch(Exception e) {
				System.out.println("Ma rong , vui long nhap lai");
			}
		}

	}
	
	private String nhapTen() {
		System.out.println("Nhap ho va ten :");
		while(true) {
			try {
				ten = scanner.nextLine();
				if(ten.isEmpty()) {
					throw new NameNotFoundException();
				}else if (ten.length()>40) {
					throw new Exception();

				}

				return ten;

			} catch (NameNotFoundException e) {
				System.out.println("Ten khong duoc rong , vui long nhap lai :");
			} catch(Exception e) {
				System.out.println("Ten khong dai qua 40 ky tu , vui long nhap lai :");
			}
		}
	}
	
	private int nhapTuoi() {
		System.out.println("Nhap tuoi :");
		while(true) {
			try {
				tuoi = Integer.parseInt(scanner.nextLine());
				if(tuoi < 0 || tuoi > 100) {
					throw new NumberFormatException();
				}
				return tuoi;
			} catch (NumberFormatException e) {
				System.out.println("Tuoi khong hop le ! Vui long nhap lai");
			}
		}
	}
	
	private String nhapDiaChi() {
		System.out.println("Nhap dia chi :");
		while(true) {
			try {
				diaChi = scanner.nextLine();
				if(diaChi.isEmpty()) {
					throw new NameNotFoundException();
				}

				return diaChi;

			} catch (NameNotFoundException e) {
				System.out.println("Ten khong duoc rong , vui long nhap lai :");
			} 
		}
	}
	
	public float diemTB() {
		return 0;
	}

	@Override
	public String toString() {
		return "SinhVien [id=" + id + ", ten=" + ten + ", tuoi=" + tuoi + ", diaChi=" + diaChi + "]";
	}
	
	
	
	
}
