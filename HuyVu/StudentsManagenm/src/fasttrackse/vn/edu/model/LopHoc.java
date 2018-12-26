package fasttrackse.vn.edu.model;

public class LopHoc {
	private int maLop;
	private String tenLop;
	private int siSoLop;
	private int maKhoa;
	
	public int getMaLop() {
		return maLop;
	}
	public void setMaLop(int maLop) {
		this.maLop = maLop;
	}
	public String getTenLop() {
		return tenLop;
	}
	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}
	public int getSiSoLop() {
		return siSoLop;
	}
	public void setSiSoLop(int siSoLop) {
		this.siSoLop = siSoLop;
	}
	public int getMaKhoa() {
		return maKhoa;
	}
	public void setMaKhoa(int maKhoa) {
		this.maKhoa = maKhoa;
	}
	@Override
	public String toString() {
		return this.tenLop;
	}
	
	
	
	
	
	
}
