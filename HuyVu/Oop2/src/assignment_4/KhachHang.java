package assignment_4;

import java.util.Scanner;

public class KhachHang {
	
	private String tenChuHo;
	private int soNha;
	private int maSoCongTo;
	
	public KhachHang() {
		
	}
	

	public KhachHang(String tenChuHo, int soNha, int maSoCongTo) {
		super();
		this.tenChuHo = tenChuHo;
		this.soNha = soNha;
		this.maSoCongTo = maSoCongTo;
	}

	
	public void nhapThongTinKhachHang() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ten chu ho : ");
		tenChuHo = scanner.nextLine();
		System.out.println("Nhap dia chi : ");
		soNha = scanner.nextInt();
		System.out.println("Nhap ma so cong to : ");
		maSoCongTo = scanner.nextInt();
		
	}
	
	public void xuatThongTinKhachHang() {
		System.out.println(" Ten chu ho : " +tenChuHo);
		System.out.println(" Dia chi : " +soNha);
		System.out.println(" So cong to : " +maSoCongTo);
	}

}
