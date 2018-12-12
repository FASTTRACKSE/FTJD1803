import java.util.ArrayList;

public class GiaoDichVang extends GiaoDich{

	String loaiVang;

	public GiaoDichVang() {
		super();
	}
	
	public GiaoDichVang(String loaiVang) {
		super();
		this.loaiVang = loaiVang;
	}

	@Override
	public float thanhTien() {
		return this.donGia*this.soLuong;
	}
	public void nhap(ArrayList<GiaoDich>arr) {
		super.nhap(arr);
		System.out.println("Nhap loai vang: ");
		this.loaiVang=sc.nextLine();
	}
	
	public String toString() {
		return "GD vang: "+super.toString()+"\tLoai vang: "+loaiVang+"\tThanh tien: "+thanhTien();
	}

}
