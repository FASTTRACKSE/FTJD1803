package hinh;

public class Vuong extends ChuNhat{
	
	
	public Vuong(double canh) {
		super(canh, canh);
		// TODO Auto-generated constructor stub
	}
	public Vuong() {
		
	}
	
	
	public double getCanh() {
		return super.getDai();
	}
	
	public void xuat() {
		System.out.println("Canh hinh vuong :" +this.getCanh()+ " Chu vi hv : " +this.getChuVi()+ " Dien tich hv :"+this.getDienTich());
	}
}
