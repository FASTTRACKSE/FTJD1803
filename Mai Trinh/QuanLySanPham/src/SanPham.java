import java.util.Scanner;

public class SanPham {
	private String tenSanPham;
	private double giaSanPham;
	private double discount;

	public SanPham() {

	}

	public SanPham(String tenSanPham, double giaSanPham, double discount) {
		super();
		this.tenSanPham = tenSanPham;
		this.giaSanPham = giaSanPham;
		this.discount = discount;
	}


	public String getTenSanPham() {
		return tenSanPham;
	}

	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}

	public double getGiaSanPham() {
		return giaSanPham;
	}

	public void setGiaSanPham(double giaSanPham) {
		this.giaSanPham = giaSanPham;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	double tinhThueNhapKhau() {
		return this.giaSanPham*0.1;

	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten san pham: ");
		this.tenSanPham=sc.nextLine();

		System.out.println("Nhap gia san pham");
		this.giaSanPham = Integer.parseInt(sc.nextLine());

		System.out.println("Nhap giam gia: ");
		this.discount = Integer.parseInt(sc.nextLine());
	}
	public void output() {
		System.out.println("Ten san pham la: "+ this.tenSanPham);
		System.out.println("Gia san pham la: "+ this.giaSanPham);
		System.out.println("Giam gia la: "+ this.discount+ "%");
		System.out.println("Thue nhap khau la: "+ this.tinhThueNhapKhau());
	}
}

