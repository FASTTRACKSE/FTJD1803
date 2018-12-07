import java.util.Scanner;

public class KhachHang {
	String hoTen;
	String soNha;
	String maSo;
	
	public KhachHang() {
		super();
	}

	public KhachHang(String hoTen, String soNha, String maSo) {
		super();
		this.hoTen = hoTen;
		this.soNha = soNha;
		this.maSo = maSo;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getSoNha() {
		return soNha;
	}

	public void setSoNha(String soNha) {
		this.soNha = soNha;
	}

	public String getMaSo() {
		return maSo;
	}

	public void setMaSo(String maSo) {
		this.maSo = maSo;
	} 
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ho ten chu ho: ");
		this.hoTen=sc.nextLine();
		
		System.out.println("Nhap so nha: ");
		this.soNha= sc.nextLine();
		
		System.out.println("Nhap ma so cong to cua ho dan su dung dien");
		this.maSo = sc.nextLine();
		
	}
	
	public void xuat() {
		System.out.println("Ho ten chu ho: "+this.getHoTen()+"\nSo nha: "+this.getSoNha()+"\nMa so cong to cua ho dan: "+this.getMaSo());
		
	}
	
}
