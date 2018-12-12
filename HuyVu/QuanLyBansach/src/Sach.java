import java.io.Serializable;
import java.util.Date;

public class Sach implements Serializable{
	
	private int idSach;
	private String tenSach;
	private String tacGia;
	private int namXuatBan;
	private String nhaXuatBan;
	private String danhMuc;
	private double donGia;
	
	private float tongDoanhThu;
	
	public Sach() {
		
	}

	public Sach(int idSach,String tenSach, String tacGia, int namXuatBan, String nhaXuatBan, String danhMuc, double donGia,
			float tongDoanhThu) {
		super();
		this.idSach = idSach;
		this.tenSach = tenSach;
		this.tacGia = tacGia;
		this.namXuatBan = namXuatBan;
		this.nhaXuatBan = nhaXuatBan;
		this.danhMuc = danhMuc;
		this.donGia = donGia;
		this.tongDoanhThu = tongDoanhThu;
	}
	
	
	
	public int getIdSach() {
		return idSach;
	}

	public void setIdSach(int idSach) {
		this.idSach = idSach;
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

	public int getNamXuatBan() {
		return namXuatBan;
	}

	public void setNamXuatBan(int namXuatBan) {
		this.namXuatBan = namXuatBan;
	}

	public String getNhaXuatBan() {
		return nhaXuatBan;
	}

	public void setNhaXuatBan(String nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}

	public String getDanhMuc() {
		return danhMuc;
	}

	public void setDanhMuc(String danhMuc) {
		this.danhMuc = danhMuc;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public float getTongDoanhThu() {
		return tongDoanhThu;
	}

	public void setTongDoanhThu(float tongDoanhThu) {
		this.tongDoanhThu = tongDoanhThu;
	}
	
	
	
	
	
}
