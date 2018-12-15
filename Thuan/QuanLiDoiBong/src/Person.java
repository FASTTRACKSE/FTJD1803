
abstract public class Person {
			String hoTen, quocTich, cauLB;
			byte tuoi;
			double luong;
			public Person() {
				
			}

			public Person(String hoTen, String quocTich, String cauLB, byte tuoi) {
				super();
				this.hoTen = hoTen;
				this.quocTich = quocTich;
				this.cauLB = cauLB;
				this.tuoi = tuoi;
			}

			public String getHoTen() {
				return hoTen;
			}

			public void setHoTen(String hoTen) {
				this.hoTen = hoTen;
			}

			public String getQuocTich() {
				return quocTich;
			}

			public void setQuocTich(String quocTich) {
				this.quocTich = quocTich;
			}

			public String getCauLB() {
				return cauLB;
			}

			public double getLuong() {
				return luong;
			}

			public void setLuong(double luong) {
				this.luong = luong;
			}

			public void setCauLB(String cauLB) {
				this.cauLB = cauLB;
			}

			public byte getTuoi() {
				return tuoi;
			}

			public void setTuoi(byte tuoi) {
				this.tuoi = tuoi;
			}
			abstract double tinhLuong();

			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return super.toString();
			}
			public void xuat() {
				System.out.println(this.hoTen + "||" + this.cauLB + "||" + this.quocTich + "||" + this.tuoi +"||" +this.luong +"||"+ this.tinhLuong());
			}
			
}
