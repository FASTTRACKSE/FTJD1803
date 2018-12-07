package SinhVien;

public class SinhVienIT extends SinhVienFPT {

	
	
	private double diemJava;
	private double diemCss;
	private double diemHtml;
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
	public double getDiem() {
		return (diemJava*2 + diemCss + diemHtml)/4;
	}
	public SinhVienIT (double hoTen,double  diemJava,double diemCss,double diemHtml)
	{
		super();
		this.diemJava = diemJava;
		this.diemCss = diemCss;
		this.diemHtml = diemHtml;
	}
}

