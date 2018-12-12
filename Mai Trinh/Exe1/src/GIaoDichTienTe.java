import java.util.ArrayList;

public class GIaoDichTienTe extends GiaoDich {
	String loaiTien;
	float tiGia;
	
	public GIaoDichTienTe() {
		super();
	}

	public GIaoDichTienTe(String loaiTien, float tiGia) {
		super();
		this.loaiTien = loaiTien;
		this.tiGia = tiGia;
	}

	public float thanhTien() {
		if(loaiTien.equals("USD")|| loaiTien.equals("Euro")) {
			return this.soLuong*this.donGia*this.tiGia ;
		}
		else if (loaiTien.equals("VND")){
			return this.soLuong*this.donGia;
		}
		return 0;
		
	}
	
	public void nhap(ArrayList <GiaoDich>arr) {
		super.nhap(arr);
		System.out.println("Nhap loai tien: ");
		this.loaiTien= sc.nextLine();
		
		System.out.println("Nhap ti gia: ");
		tiGia = Float.parseFloat(sc.nextLine());
	}
	
	public String toString() {
		return "GD Tien te: "+super.toString()+"\tLoai tien= "+this.loaiTien+"\tTi gia: "+this.tiGia+"\tThanh tien: "+thanhTien();
	}
}
