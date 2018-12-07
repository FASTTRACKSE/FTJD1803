
public class Vuong extends ChuNhat {
		
	//private int canh;
	public Vuong(int canh) {
		super(canh, canh);
		//this.canh= canh;
		// TODO Auto-generated constructor stub
	}
	
	public Vuong() {
	
	}

	public int getCanh() {
		return super.getDai();
	}

//	public void setCanh(int canh) {
//		this.canh = canh;
//	}

//	public float getChuVi() {
//		return canh*4;
//	}
//	
//	public double getDienTich() {
//		return canh*canh;
//	}
	public void xuat() {
		System.out.println("Canh hinh vuong: "+this.getCanh()+"		Dien tich: "+this.getDienTich()+"	Chu vi: "+this.getChuVi());
	}
}
