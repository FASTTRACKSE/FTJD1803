
public class ChuNhat {
	private int rong;
	private int dai;
	
	public float getChuVi() {
		return (dai+rong)*2;
	}
	
	public double getDienTich() {
		return dai*rong;
	}
	
	public int getRong() {
		return rong;
	}

	public void setRong(int rong) {
		this.rong = rong;
	}

	public int getDai() {
		return dai;
	}

	public void setDai(int dai) {
		this.dai = dai;
	}

	public void xuat() {
		System.out.println("Chieu rong: "+this.rong+"	Chieu dai: "+this.dai+"	Dien tich: "+this.getDienTich()+"	Chu vi: "+this.getChuVi());
	}

	public ChuNhat(int rong, int dai) {
		super();
		this.rong = rong;
		this.dai = dai;
	}

	public ChuNhat() {
		super();
	}
}
