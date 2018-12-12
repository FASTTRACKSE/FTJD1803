package project;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class QuanLySinhVien {
	
	public static Scanner scanner = new Scanner(System.in);

	private List<SinhVien> listSinhVien;
	private SinhVienDao sinhVienDao;
	private SinhVien sinhVien;
	public QuanLySinhVien() {
		sinhVienDao = new SinhVienDao();
		listSinhVien = sinhVienDao.read();
	}
	
	public void nhap() throws IOException {
		System.out.println("Chon loai can bo : 1 - Giang vien , 2 - Nhan vien");
		int choice = scanner.nextInt();
		if(choice==1) {
			sinhVien = new SinhVienIt();
			sinhVien.nhap();
			listSinhVien.add(sinhVien);
		}else if (choice==2) {
			sinhVien = new SinhVienBiz();
			sinhVien.nhap();
			listSinhVien.add(sinhVien);
		}
		SinhVien sv = new SinhVien();
		listSinhVien.add(sv);
		sinhVienDao.write(listSinhVien);
	}
}
