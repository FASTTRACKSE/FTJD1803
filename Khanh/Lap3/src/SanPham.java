import java.util.Scanner;

public class SanPham {
	//thuoc tinh
	String tenSP;
	double donGia;
	double giamGia;
	double thueNK;
	//nhap gia tri
	public void input () {
		Scanner Scan = new Scanner(System.in);
		System.out.print("Nhap ten san pham: ");
		this.tenSP = Scan.nextLine();
		System.out.print("nhap don gia: ");
		this.donGia = Scan.nextDouble();
		System.out.print("giam gia: ");
		this.giamGia = Scan.nextDouble();
	}
	public void getThueNhapKhau () {
		 double nhapKhau;
		nhapKhau = donGia * 0.1;
		System.out.println("nhap khau: " +nhapKhau);
		
	}
	public void output () {
		System.out.println("thong tin san pham" + this.tenSP + "|" + this.donGia + "|" + this.giamGia);
	}
	//ham main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SanPham SP1 = new SanPham();
		SP1.input();
		SP1.getThueNhapKhau();
		SP1.output();
		SanPham SP2 = new SanPham();
		SP2.input();
		SP2.getThueNhapKhau();
		SP2.output();
	}
	
}

