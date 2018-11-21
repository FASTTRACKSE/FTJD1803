package hinh;

public class ChuNhat {
	
	double rong;
	double dai;
	
	public ChuNhat() {
		
	}
	public ChuNhat(double rong, double dai) {
		super();
		this.rong = rong;
		this.dai = dai;
	}

	public double getChuVi() {
		return (rong + dai)*2;
	}
	
	public double getDienTich() {
		return dai*rong;
	}
	
	public double getRong() {
		return rong;
	}

	public void setRong(double rong) {
		this.rong = rong;
	}

	public double getDai() {
		return dai;
	}

	public void setDai(double dai) {
		this.dai = dai;
	}

	public void xuat() {
		System.out.println("Chieu dai : " + this.dai + "Chieu rong :" + this.rong + " Chu vi : " + this.getChuVi() + " Dien tich :" + this.getDienTich());
	}
}
