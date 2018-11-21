
public class NhanVien {

	String maNV;
	int soSP;

	public NhanVien() {
		super();
	}

	public NhanVien(String maNV, int soSP) {
		super();
		this.maNV = maNV;
		this.soSP = soSP;
	}

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public int getSoSP() {
		return soSP;
	}

	public void setSoSP(int soSP) {
		this.soSP = soSP;
	}

	public boolean coVuotChuan() {
		if (this.soSP>500) {
			return true;
		}
		return false;
	}

	public String getTongKet() {
		if (this.soSP>500) {
			return "Vuot";
		}
		return "";
	}
	public double getLuong() {
		if(this.soSP<=500) {
			return this.soSP*20000;
		}
		return this.soSP*20000+ (500-this.soSP)*30000;
	}

	public static void XuatTieuDe(){
		System.out.println("MaNV\t\tSoSP\t\tLuong\t\tTongKet"); 
	}

	public String toString() {
		return  maNV +"\t\t" + soSP + "\t\t" + getLuong() + "\t\t" + getTongKet();
	}

}
