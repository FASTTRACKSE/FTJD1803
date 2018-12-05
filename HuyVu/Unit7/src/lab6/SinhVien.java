package lab6;

import java.util.Scanner;

public class SinhVien {

	private int idSinhVien;
	private String tenSinhVien;
	private int tuoiSinhVien;
	private double diemSinhVien;
	SinhVien sv;
	Scanner scanner = new Scanner(System.in);

	public SinhVien() {

	}

	public SinhVien(int idSinhVien, String tenSinhVien, int tuoiSinhVien, double diemSinhVien) {
		super();
		this.idSinhVien = idSinhVien;
		this.tenSinhVien = tenSinhVien;
		this.tuoiSinhVien = tuoiSinhVien;
		this.diemSinhVien = diemSinhVien;
	}

	public int getIdSinhVien() {
		return idSinhVien;
	}

	public void setIdSinhVien(int idSinhVien) {
		this.idSinhVien = idSinhVien;
	}

	public String getTenSinhVien() {
		return tenSinhVien;
	}

	public void setTenSinhVien(String tenSinhVien) {
		this.tenSinhVien = tenSinhVien;
	}

	public int getTuoiSinhVien() {
		return tuoiSinhVien;
	}

	public void setTuoiSinhVien(int tuoiSinhVien) {
		this.tuoiSinhVien = tuoiSinhVien;
	}

	public double getDiemSinhVien() {
		return diemSinhVien;
	}

	public void setDiemSinhVien(double diemSinhVien) {
		this.diemSinhVien = diemSinhVien;
	}

	public void nhap(){


		System.out.println("Nhap ma sinh vien : ");
		idSinhVien = Integer.parseInt(scanner.nextLine());
		try {
			StudentException.checkMaSinhVien(idSinhVien);
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Nhap ten sinh vien : ");
		tenSinhVien = scanner.nextLine();
		try {
			StudentException.checkTenSinhVien(tenSinhVien);
		} catch (StudentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		System.out.println("Nhap tuoi sinh vien :");
		tuoiSinhVien = Integer.parseInt(scanner.nextLine());
		try {
			StudentException.checkTuoi(tuoiSinhVien);
		} catch (StudentException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} 

		System.out.println("Nhap diem sinh vien");
		diemSinhVien = Double.parseDouble(scanner.nextLine());
		try {
			StudentException.checkDiem(diemSinhVien);
		} catch (StudentException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}

	}

	@Override
	public String toString() {
		return "Danh sach sinh vien [idSinhVien=" + idSinhVien + ", tenSinhVien=" + tenSinhVien + ", tuoiSinhVien=" + tuoiSinhVien
				+ ", diemSinhVien=" + diemSinhVien + "]";
	}



}
