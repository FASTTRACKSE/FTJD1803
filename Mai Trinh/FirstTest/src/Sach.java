import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Sach implements Serializable {


	String tenSach;
	String tacGia;
	int namXBan;
	String nhaXBan;
	String danhMuc;
	float donGia;


	public Sach() {
		super();
	}


	public Sach(String tenSach, String tacGia, int namXBan, String nhaXBan, String danhMuc, float donGia) {
		super();
		this.tenSach = tenSach;
		this.tacGia = tacGia;
		this.namXBan = namXBan;
		this.nhaXBan = nhaXBan;
		this.danhMuc = danhMuc;
		this.donGia = donGia;
	}


	public String getTenSach() {
		return tenSach;
	}


	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}


	public String getTacGia() {
		return tacGia;
	}


	public void setTacGia(String tacGia) {
		this.tacGia = tacGia;
	}


	public int getNamXBan() {
		return namXBan;
	}


	public void setNamXBan(int namXBan) {
		this.namXBan = namXBan;
	}


	public String getNhaXBan() {
		return nhaXBan;
	}


	public void setNhaXBan(String nhaXBan) {
		this.nhaXBan = nhaXBan;
	}


	public String getDanhMuc() {
		return danhMuc;
	}


	public void setDanhMuc(String danhMuc) {
		this.danhMuc = danhMuc;
	}


	public float getDonGia() {
		return donGia;
	}


	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}


	public void nhap() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap ten sach: ");
		this.tenSach= sc.nextLine();

		System.out.println("Nhap tac gia cua sach: ");
		this.tacGia = sc.nextLine();


		System.out.println("Nhap nam xuat ban: ");
		this.namXBan = Integer.parseInt(sc.nextLine());


		System.out.println("Nhap nha xuat ban: ");
		this.nhaXBan = sc.nextLine();


		System.out.println("Nhap danh muc: ");
		this.danhMuc = sc.nextLine();


		System.out.println("Nhap gia ban: ");
		this.donGia = Float.parseFloat(sc.nextLine());


	}

	public void xuat() {
		System.out.printf("Ten sach: %2s",this.getTenSach() );
		System.out.printf("\tTen tac gia: %2s",this.getTacGia());
		System.out.printf("\tNam xuat ban:%4s ",this.getNamXBan());
		System.out.printf("\tNha xuat ban: %2s",this.getNhaXBan());
		System.out.printf("\tDanh muc: %2s",this.getDanhMuc());
		System.out.println("\tGia ban: "+this.getDonGia());
	}

	public void nhap(ArrayList<Sach> arr) {
		Scanner sc=new Scanner (System.in);
		kiemtraTenSach(arr);
		kiemtraTenTacGia();
		kiemtraNamXuatBan();
		kiemtraNhaXuatBan();
		kiemtraDonGia();

	}

	void kiemtraTenSach(ArrayList<Sach> arr) {
		Scanner sc=new Scanner (System.in);
		while(true) {
			try {
				System.out.println("Nhap ten sach:");

				this.tenSach = sc.nextLine();
				SachException.checkTenSach (this.tenSach);break;
			} catch (SachException e1) {
				// TODO Auto-generated catch block
				System.out.println(e1.toString());
			}
			catch(NumberFormatException e){
				System.out.println("Ten khong duoc rong!");

			}
		}
	}

	void kiemtraTenTacGia() {
		Scanner sc=new Scanner (System.in);
		while(true) {

			try {
				System.out.println("Nhap tac gia cua sach:");
				this.tacGia = sc.nextLine();
				SachException.checkTacGia(this.tacGia);break;
			} catch (SachException e) {
				// TODO Auto-generated catch block
				System.out.println("Vui long nhap lai ten tac gia");
			}
		}
	}

	void kiemtraNamXuatBan() {
		Scanner sc=new Scanner (System.in);
		while(true) {

			try {
				System.out.println("Nhap nam xuat ban:");
				this.namXBan = Integer.parseInt(sc.nextLine());
				SachException.checknamXBan(this.namXBan);break;
			} catch (SachException e1) {
				// TODO Auto-generated catch block
				System.out.println("Nam phai >0");
			}
		}
	}
	
	void kiemtraDonGia() {
		Scanner sc=new Scanner (System.in);
		while(true) {

			try {
				System.out.println("Nhap gia:");
				this.donGia = Float.parseFloat(sc.nextLine());
				SachException.checkDonGia(this.donGia);break;
			} catch (SachException e1) {
				// TODO Auto-generated catch block
				System.out.println("Nam phai >0");
			}
		}
	}
	void kiemtraNhaXuatBan() {
		Scanner sc=new Scanner (System.in);
		while(true) {

			try {
				System.out.println("Nhap nha xuat ban:");
				this.nhaXBan = sc.nextLine();
				SachException.checkNhaXBan(this.nhaXBan);break;
			} catch (SachException e) {
				// TODO Auto-generated catch block
				System.out.println("diem phai tu 0 den 10");
			}
		}
	}

}
