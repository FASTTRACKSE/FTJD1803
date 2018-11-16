import java.util.Scanner;

public class sanpham {
	public String tenSp;
	public double donGia;
	public double giamGia;
	public double getThueNhapKhau() {
		double thueNK;
		thueNK=(double)this.donGia*0.1;
		return thueNK;
	}
	public void nhap() {
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap ten:");
		this.tenSp=sc.nextLine();
		System.out.println("nhap don gia:");
		this.donGia=sc.nextDouble();
		System.out.println("nhap giam gia:");
		this.giamGia=sc.nextDouble();
	}
	public void xuat() {
		System.out.printf("ten:%s \t don gia:%.2f \t giamgia:%.2f \t thue:%.2f \t \n",this.tenSp,this.donGia,this.giamGia,this.getThueNhapKhau());
	}
}
