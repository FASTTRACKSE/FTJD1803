import java.util.ArrayList;
import java.util.Scanner;

public abstract class GiaoDich {
	int maGDich, soLuong;
	float donGia;
	
	String ngayGDich;
	
	
	public GiaoDich() {
		super();
	}

	public GiaoDich(int maGDich, int soLuong, float donGia, String ngayGDich) {
		super();
		this.maGDich = maGDich;
		this.soLuong = soLuong;
		this.donGia = donGia;
		this.ngayGDich = ngayGDich;
	}

	public int getMaGDich() {
		return maGDich;
	}

	public void setMaGDich(int maGDich) {
		this.maGDich = maGDich;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public float getDonGia() {
		return donGia;
	}

	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}

	public String getNgayGDich() {
		return ngayGDich;
	}

	public void setNgayGDich(String ngayGDich) {
		this.ngayGDich = ngayGDich;
	}

	abstract public float thanhTien();
	
	Scanner sc = new Scanner(System.in);
	
	
	public void nhap(ArrayList<GiaoDich> arr) {
		checkmaGDich(arr);
		System.out.println("Nhap ngay giao dich: ");
		this.ngayGDich= sc.nextLine();
		System.out.println("Nhap don gia: ");
		this.donGia = Float.parseFloat(sc.nextLine());
		System.out.println("Nhap so luong: ");
		this.soLuong = Integer.parseInt(sc.nextLine());
		
	}
	
	public String toString() {
		return "\tMAGD=	" +maGDich+"\tSoluong=	"+soLuong+"\tNgayGD=	"+ngayGDich+"\tDongia=	"+donGia;
	}
	
	

	void checkmaGDich(ArrayList<GiaoDich> arr) {
		while(true) {
			try {
				System.out.println("Nhap ma giao dich: ");
				this.maGDich = Integer.parseInt(sc.nextLine());
				GiaoDichException.checkmaGDich(maGDich); break;
			} catch (GiaoDichException e1) {
				// TODO Auto-generated catch block
				System.out.println(e1.toString());
			}
			catch(NumberFormatException e){
				System.out.println("Vui long nhap so!");

			}
		}
	
		
	}
	
	
}
