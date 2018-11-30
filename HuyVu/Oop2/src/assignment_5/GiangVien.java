package assignment_5;

import java.util.Scanner;

public class GiangVien extends ThongTinCanBo{
		private String khoa;
		private String trinhDo;
		private int soTietDay;
		
		private int chon;
		Scanner scanner = new Scanner(System.in);
		
		public GiangVien() {
		
		}

		public GiangVien(String khoa, String trinhDo, int soTietDay) {
			super();
			this.khoa = khoa;
			this.trinhDo = trinhDo;
			this.soTietDay = soTietDay;
		}

		public String getKhoa() {
			return khoa;
		}

		public void setKhoa(String khoa) {
			this.khoa = khoa;
		}

		public String getTrinhDo() {
			return trinhDo;
		}

		public void setTrinhDo(String trinhDo) {
			this.trinhDo = trinhDo;
		}

		public int getSoTietDay() {
			return soTietDay;
		}

		public void setSoTietDay(int soTietDay) {
			this.soTietDay = soTietDay;
		}
		
		public void nhap() {
			super.nhap();
			
			System.out.println("Nhap khoa :");
			this.khoa = scanner.nextLine();
			
			System.out.println("Nhap trinh do -> Chon : 1 - cu nhan , 2 - thac si , 3 - tien si ");
			chon = scanner.nextInt();
			switch (chon) {
			case 1:
				trinhDo = "cu nhan";
				this.setPhuCap(300);
				break;
			case 2:
				trinhDo = "thac si";
				this.setPhuCap(500);
				break;
			case 3:
				trinhDo = "tien si";
				this.setPhuCap(1000);
			default:
				break;
			}
			System.out.println("Nhap so tiet day : ");
			this.soTietDay = scanner.nextInt();
		}
		
		public double tinhLuong() {
			return (double)(this.getHeSoLuong()*730 + this.getPhuCap()+this.getSoTietDay()*45);
		}

		@Override
		public String toString() {
			return "GiangVien [khoa=" + khoa + ", trinhDo=" + trinhDo + ", soTietDay=" + soTietDay + "]";
		}

		
		

}
