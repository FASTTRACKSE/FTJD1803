package assignment_4;

import java.util.Scanner;

public class BienLai {
	private int chiSoCu;
	private int chiSoMoi;
	private double tienPhaiTra;
	private KhachHang khachHang;
	public BienLai() {

	}

	public BienLai(KhachHang khachHang,int chiSoCu, int chiSoMoi, double tienPhaiTra) {
		super();
		this.chiSoCu = chiSoCu;
		this.chiSoMoi = chiSoMoi;
		this.tienPhaiTra = tienPhaiTra;
		this.khachHang = khachHang;
	}


	public void nhapBienLai() {

		khachHang = new KhachHang();
		khachHang.nhapThongTinKhachHang();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap chi so cu :");
		chiSoCu = scanner.nextInt();

		System.out.println("Nhap chi so moi :");
		chiSoMoi = scanner.nextInt();

		tienPhaiTra = (double)(chiSoMoi-chiSoCu)*750;

	}

	public void hienThiBienLai() {
		khachHang.xuatThongTinKhachHang();
		System.out.println("Chi so cu : "+this.chiSoCu);
		System.out.println("Chi so moi : "+this.chiSoMoi);
		System.out.println("So tien phai tra :" +this.tienPhaiTra);
	}

}
