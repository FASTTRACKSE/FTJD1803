
public class ChuNhat {
		private double rong, dai;
		
		public ChuNhat() {
			
		}
		

		public ChuNhat(double rong, double dai) {
			super();
			this.rong = rong;
			this.dai = dai;
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
		
		public double getChuVi() {
			return (dai + rong)* 2;
		}
		public double getDienTich() {
			return dai * rong;
		}
		
		public void Xuat() {
			System.out.print("\nchieu dai :"+ this.dai);
			System.out.print("\nchieu rong :"+ this.rong);
			System.out.print("\nchu vi :"+ this.getChuVi());
			System.out.print("\ndien tich :"+ this.getDienTich());
			
		}
}
