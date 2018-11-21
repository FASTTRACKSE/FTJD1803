package Bai3;

public class SinhVienIt extends SinhVienFpt {
	
	private double diemJava;
	private double diemCss;
	private double diemHtml;
	
	public SinhVienIt() {
		
	}

	public SinhVienIt(String hoTen,double diemJava, double diemCss, double diemHtml) {
		super();
		this.getHoTen();
		this.diemJava = diemJava;
		this.diemCss = diemCss;
		this.diemHtml = diemHtml;
	}

	public double getDiem() {
		return (2*diemJava + diemHtml + diemCss)/4;
	}

	public double getDiemJava() {
		return diemJava;
	}

	public void setDiemJava(double diemJava) {
		this.diemJava = diemJava;
	}

	public double getDiemCss() {
		return diemCss;
	}

	public void setDiemCss(double diemCss) {
		this.diemCss = diemCss;
	}

	public double getDiemHtml() {
		return diemHtml;
	}

	public void setDiemHtml(double diemHtml) {
		this.diemHtml = diemHtml;
	}
	
	
	
	
}
