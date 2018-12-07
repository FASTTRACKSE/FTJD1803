package Bai4;

public class SinhVienIt {
	private double diemJava;
	private double diemHtml;
	private double diemCs;
	
	public SinhVienIt(){
		
	}

	public SinhVienIt(double diemJava, double diemHtml, double diemCs) {
		super();
		this.diemJava = diemJava;
		this.diemHtml = diemHtml;
		this.diemCs = diemCs;
	}

	public double getDiemJava() {
		return diemJava;
	}

	public void setDiemJava(double diemJava) {
		this.diemJava = diemJava;
	}

	public double getDiemHtml() {
		return diemHtml;
	}

	public void setDiemHtml(double diemHtml) {
		this.diemHtml = diemHtml;
	}

	public double getDiemCs() {
		return diemCs;
	}

	public void setDiemCs(double diemCs) {
		this.diemCs = diemCs;
	}
	
	
}
