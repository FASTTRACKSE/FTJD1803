
public class HinhVuong extends ChuNhat {
			public HinhVuong(int canh) {
				super(canh, canh);
			}
			public double getCanh() {
				return super.getDai();
			}
			public void xuat() {
				System.out.print("\ncanh: "+ this.getCanh());
				System.out.print("\ndien tich: "+this.getChuVi());
			}
}
