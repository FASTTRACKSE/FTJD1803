package Bai4;

public class SinhVienBiz {
	private double diemMarketing;
	private double diemSale;
	
	public SinhVienBiz() {
		
	}

	public SinhVienBiz(double diemMarketing, double diemSale) {
		super();
		this.diemMarketing = diemMarketing;
		this.diemSale = diemSale;
	}

	public double getDiemMarketing() {
		return diemMarketing;
	}

	public void setDiemMarketing(double diemMarketing) {
		this.diemMarketing = diemMarketing;
	}

	public double getDiemSale() {
		return diemSale;
	}

	public void setDiemSale(double diemSale) {
		this.diemSale = diemSale;
	}
	
	
}
